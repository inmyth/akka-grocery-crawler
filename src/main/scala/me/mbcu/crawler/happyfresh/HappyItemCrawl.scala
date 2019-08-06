package me.mbcu.crawler.happyfresh


import java.io.File
import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}

import akka.actor.Actor
import akka.dispatch.ExecutionContexts.global
import akka.stream.ActorMaterializer
import me.mbcu.crawler.happyfresh.HappyItemCrawl.RequestItem
import me.mbcu.crawler.honestbee.ImageCrawl.DStore
import me.mbcu.crawler.utils.Utils
import me.mbcu.scala.MyLogging
import net.ruippeixotog.scalascraper.browser.JsoupBrowser
import net.ruippeixotog.scalascraper.scraper.ContentExtractors.{attr, elementList}
import play.api.libs.json.{JsValue, Json}
import play.api.libs.ws.ahc.StandaloneAhcWSClient

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.concurrent.{ExecutionContextExecutor, Future}
import scala.util.Try

object HappyItemCrawl {

  def buildUrl(storeCode:Int, taxonCode: Int, page: Int) =
    s"https://gvg1d6u3wk.execute-api.ap-southeast-1.amazonaws.com/prod/catalog/stock_locations/$storeCode/taxons/$taxonCode/products?=undefined&page=$page&taxon_id=$taxonCode&popular=true&per_page=100"

  case class RequestItem(storeCode: Int, taxonName: String, taxonCode:Int, page: Int = 1)

  case class Cart(reqs: ListBuffer[RequestItem], res: ListBuffer[JsValue], dir: File)

  case class DelayedHit(cart: Cart)

  case class Hit(cart: Cart)

  case class DeqStore(dir: File)

  object Mode extends Enumeration {
    type Mode = Value
    val MISSING_ONLY, REWRITE = Value
  }


  case class ParseException(m: String) extends Exception(m)
}

class HappyItemCrawl(root: String) extends Actor with MyLogging{
  import HappyItemCrawl._
  import scala.concurrent.duration._
  import scala.language.postfixOps
  import net.ruippeixotog.scalascraper.dsl.DSL._
  import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
  import net.ruippeixotog.scalascraper.dsl.DSL.Parse._

  private implicit val materializer = ActorMaterializer()
  private implicit val ec: ExecutionContextExecutor = global
  private var ws = StandaloneAhcWSClient()
  private val qStores : mutable.Queue[File] = mutable.Queue.empty

  val mode = Mode.MISSING_ONLY
  val jDir = new File(root)
  val workDirs =  mode match {
    case Mode.REWRITE => jDir.listFiles.filter(_.isDirectory).toSeq
    case _ => jDir.listFiles.filter(_.isDirectory).map(p => (p, new File(p.getPath + "/products.txt"))).filterNot(_._2.exists()).map(_._1).toSeq
  }
  qStores ++= workDirs
  self ! "start"

  override def receive: Receive = {

    case "start" =>
      if (qStores.isEmpty){
        info("Done")
      }
      else {
        self ! DeqStore(qStores.dequeue())
      }

    case DeqStore(dir) =>
      val js = Utils.readFile(new File(dir + "/info.txt"))
      val slug = (js \ "slug").as[String]
      val storeId = (js \ "id").as[Int]
      val url = s"https://www.happyfresh.id/$slug/"
      ws.url(url)
        .withRequestTimeout(8 seconds)
        .get()
        .map(p => (storeId, p.body)).map(getTaxons).map(p => self ! DelayedHit(Cart(p, ListBuffer.empty, dir)))
        .recover{
          case e: Exception =>
            error(s"$url\n${e.getMessage}")
            self ! DeqStore(dir)
        }

    case DelayedHit(cart) => context.system.scheduler.scheduleOnce(1 second, self, Hit(cart))

    case Hit(cart) =>
      val req = cart.reqs.head
      info(s"${req.storeCode} ${req.taxonName} page-${req.page}")
      ws.url(buildUrl(req.storeCode, req.taxonCode, req.page))
      .addHttpHeaders("X-API-Key" -> "HdI3wa6E3L6ECd1XYZZjJ92d4wUGOD4X6CrtO6MM")
      .withRequestTimeout(5 seconds)
      .get()
      .map(p => (Json.parse(p.body), req, cart)).map(parseProducts).map(parseNextPages).map(nextCart).map(p => {
        if (p._2.reqs.isEmpty){
          save(p._2.dir.getPath + "/products.txt", p._2.res)
          self ! "start"
        } else {
          self ! DelayedHit(p._2)
        }
      })
      .recover{
        case e: Exception =>
          self ! DelayedHit(cart)
      }
  }

  def getTaxons(in: (Int, String)): ListBuffer[RequestItem] =  {
    val storeCode = in._1
    val html = in._2
    val browser = JsoupBrowser()
    val doc = browser.parseString(html)
    val items = doc >> elementList(".category-list-wrapper li")
    val subs = doc >> elementList(".subcategory-name").map(_ >> attr("href")("a"))
    subs.filter(_.startsWith("http")).map(p => {
      val full = p.split("/")(4)
      val code = Try(full.split("-").last.toInt).toOption // some links are broken
      (full, code)
    }).filterNot(_._2.isEmpty).map(p => RequestItem(storeCode, p._1, p._2.get)).to[ListBuffer]
  }

  def parseProducts(in: (JsValue,  RequestItem,  Cart)) =  (in._1, in._2, in._3, (in._1 \ "products").as[List[JsValue]])

  def parseNextPages(in: (JsValue, RequestItem, Cart, List[JsValue])) =  {
    val currentPage = (in._1 \ "current_page").as[Int]
    val pages = (in._1 \ "pages").as[Int]
    val nexts = if (currentPage == 1 && pages > 1 ) (2 to pages).map(p => RequestItem(in._2.storeCode, in._2.taxonName, in._2.storeCode, p)) else List.empty
    (in._2, in._3,  in._4, nexts)
  }

  def nextCart(in: (RequestItem, Cart, List[JsValue], Seq[RequestItem])) = {
    in._2.reqs.remove(0)
    in._2.res  ++= in._3
    in._2.reqs ++= in._4
    (in._1, in._2)
  }

  def save(path:String, in: ListBuffer[JsValue]): Unit = Utils.writeFile(path, Json.prettyPrint(Json.toJson(in)))
}
