package me.mbcu.crawler.happyfresh

import java.io.File

import akka.actor.Actor
import akka.dispatch.ExecutionContexts.global
import akka.stream.ActorMaterializer
import akka.stream.scaladsl.Sink
import akka.util.ByteString
import me.mbcu.crawler.happyfresh.HappyImageCrawl.TargetFile
import me.mbcu.crawler.happyfresh.HappyItemCrawl.RequestItem
import me.mbcu.crawler.utils.Utils
import me.mbcu.scala.MyLogging
import play.api.libs.json.JsValue
import play.api.libs.ws.ahc.StandaloneAhcWSClient

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.concurrent.ExecutionContextExecutor

object HappyImageCrawl {

  case class Cart(targets: ListBuffer[TargetFile])

  case class TargetFile(dirs: List[File], target: File, url: String)

  case class DeqStore(dir: File)

  case class DelayedHit(cart: Cart)

  case class Hit(cart: Cart)

   object Mode extends Enumeration {
    type Mode = Value
    val ITEMS_REWRITE, ITEMS_MISSING, STORES_REWRITE = Value
  }
}

class HappyImageCrawl(root: String) extends Actor with MyLogging{
  import  HappyImageCrawl._
  import scala.concurrent.duration._
  import scala.language.postfixOps
  import net.ruippeixotog.scalascraper.dsl.DSL._
  import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
  import net.ruippeixotog.scalascraper.dsl.DSL.Parse._

  private implicit val materializer = ActorMaterializer()
  private implicit val ec: ExecutionContextExecutor = global
  private var ws = StandaloneAhcWSClient()
  private val qStores : mutable.Queue[File] = mutable.Queue.empty

  val mode = Mode.ITEMS_MISSING
  val dirs = new File(root).listFiles.filter(_.isDirectory).toSeq
  qStores ++= dirs
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
      mode match {

        case Mode.ITEMS_MISSING =>
          val x = buildProducts(dir.getPath, Utils.readFile(new File(dir.getPath + "/products.txt")).as[List[JsValue]]).filterNot(_.target.exists())
          if (x.isEmpty) self ! "start" else self ! DelayedHit(Cart(x.to[ListBuffer]))

        case _ =>
          val x = buildProducts(dir.getPath, Utils.readFile(new File(dir.getPath + "/products.txt")).as[List[JsValue]])
          self ! DelayedHit(Cart(x.to[ListBuffer]))

      }

    case DelayedHit(cart) => context.system.scheduler.scheduleOnce(1 second, self, Hit(cart))

    case Hit(cart) =>
      val t = cart.targets.head
      t.dirs.foreach(p =>  scala.reflect.io.File(p).createDirectory(force = false, failIfExists = false))
      info(s"${t.target.getPath} - ${t.url}")
      ws.url(t.url)
        .addHttpHeaders("User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:66.0) Gecko/20100101 Firefox/66.0")
        .withRequestTimeout(8 seconds)
        .withMethod("GET")
        .stream()
        .flatMap{
          res =>
            val outputStream = java.nio.file.Files.newOutputStream(t.target.toPath)
            // The sink that writes to the output stream
            val sink = Sink.foreach[ByteString] { bytes =>
              outputStream.write(bytes.toArray)
            }

            // materialize and run the stream
            res.bodyAsSource.runWith(sink).andThen {
              case result =>
                // Close the output stream whether there was an error or not
                outputStream.close()
                // Get the result or rethrow the error
                result.get
            }.map(_ => cart)

        }.map(p => {
          p.targets.remove(0)
          if (p.targets.isEmpty) {
            self ! "start"
          } else {
            self ! DelayedHit(p)
          }
        })
        .recover{
          case e: Exception =>
            error(s"${t.url}\n${e.getMessage}")
            self ! DelayedHit(cart)
        }
  }

  def buildProducts(storePath: String, list: List[JsValue]): List[TargetFile] = {
    list.flatMap(p => {
      val itemId = (p \ "id").as[Int]
      (p \ "variants").as[List[JsValue]].flatMap(q => (q \ "images").as[List[JsValue]]).map(p => {
        val imgId = (p \ "id").as[Int]
        val imgUrl = (p \ "large_url").as[String]
        (imgId, imgUrl)
      }).map(p => TargetFile(List((new File(s"$storePath/products/")),(new File(s"$storePath/products/$itemId/"))), new File(s"$storePath/products/$itemId/${p._1}.jpg"), p._2))
    })
  }

}
