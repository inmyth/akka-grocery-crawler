package me.mbcu.crawler.honestbee

import java.nio.charset.StandardCharsets
import java.nio.file.{Files, Paths}

import akka.actor.Actor
import akka.dispatch.ExecutionContexts.global
import akka.stream.ActorMaterializer
import me.mbcu.crawler.honestbee.Result.{HappyFresh, Prod}
import me.mbcu.scala.MyLogging
import play.api.libs.json.{JsValue, Json}
import play.api.libs.ws.ahc.StandaloneAhcWSClient

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.concurrent.{ExecutionContext, ExecutionContextExecutor}

object TextCrawl {
  case class ReqParams(storeId: Int, name: String, department: Int, categoryId: Int, page: Int, sort: String = "ranking" )

  case class Delay(params: ReqParams)

  case class Get(params: ReqParams)

}

class TextCrawl(path: String) extends Actor with MyLogging{
  import TextCrawl._

  import scala.concurrent.duration._
  import scala.language.postfixOps

  private implicit val materializer = ActorMaterializer()
  private implicit val ec: ExecutionContextExecutor = global

  private var ws                          = StandaloneAhcWSClient()
  private val result: HappyFresh          = HappyFresh(ListBuffer.empty)
  private val q : mutable.Queue[ReqParams] = mutable.Queue.empty

  override def receive: Receive = {
    case "start" =>
      q ++= Seed.all.flatMap(p => p.params.map(q => ReqParams(p.storeId, p.name, q.department,q.categoryId, 1)))
      self ! "dequeue"

    case Delay(reqParams) => context.system.scheduler.scheduleOnce(1 second, self, Get(reqParams))

    case "dequeue" =>
      if (q.nonEmpty) {
        val next = q.dequeue()
        if (result.products.nonEmpty && result.products.head.storeId != next.storeId) {
          writeFile()
          result.products.clear()
        }
        self ! Delay(next)
      } else {
        writeFile()
        result.products.clear()
        self ! "exit"
      }

    case Get(params) =>
      info(params.toString)
      get(params)

    case "write" =>
      val json = Json.prettyPrint(Json.toJson(result))
      writeFile(result.products.head.name, json)
      result.products.clear()
      self ! "dequeue"

    case "exit" =>
      info("EXITING")
      implicit val executionContext: ExecutionContext = context.system.dispatcher
      context.system.scheduler.scheduleOnce(Duration.Zero)(System.exit(_))

  }

  def writeFile(): Unit = {
    val json = Json.prettyPrint(Json.toJson(result))
    writeFile(result.products.head.name, json)
  }

  def get(params: ReqParams): Unit =
      ws.url(buildUrl(params))
        .addHttpHeaders("Accept" -> "application/vnd.honestbee+json;version=2")
        .withRequestTimeout(3 seconds)
        .get()
        .map(response => parse(params, response.body))
        .recover{
          case e: Exception => get(params)
        }


  def parse(params: ReqParams, raw: String): Unit = {
    val jsValue = Json.parse(raw)
    if (!(jsValue \ "products").isDefined) {
      error(
        s"""ERROR
           |$params
           |$raw
         """.stripMargin)
      self ! "exit"
    } else {
      val totalPages = (jsValue \ "meta" \ "total_pages").as[Int]
      val products = (jsValue \ "products").as[List[JsValue]].map(p => Prod(params.storeId, params.name, params.department, params.categoryId, p))
      if (params.page == 1 && totalPages == 0){
        error(s"""ERROR WRONG CATEGORY OR DEPARTMENT
           |$params
           |$raw
         """.stripMargin)
        self ! "exit"
      }
      else {
        result.products ++= products
        info(result.products.size.toString)
        if (params.page >= totalPages) {
          self ! "dequeue"
        }
        else {
          val newParams = ReqParams(params.storeId, params.name, params.department, params.categoryId, params.page+1)
          self ! Delay(newParams)
        }
      }


    }

  }


  def writeFile(name: String, content: String): Unit = Files.write(Paths.get(path + s"$name.txt"), content.getBytes(StandardCharsets.UTF_8))

  def buildUrl(params: ReqParams): String = {
    val r = s" https://id.honestbee.com/api/api/departments/${params.department}?sort=${params.sort}&page=${params.page}&storeId=${params.storeId}"
    if (params.categoryId != 0) r + s"&categoryIds[]=${params.categoryId}" else r
  }


  // https://id.honestbee.com/api/api/departments/45844?categoryIds[]=241163&sort=ranking&page=2&storeId=32369


}
