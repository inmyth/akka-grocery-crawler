package me.mbcu.crawler.honestbee

import java.io.{File, FileInputStream}
import java.net.URL

import akka.actor.Actor
import akka.dispatch.ExecutionContexts.global
import akka.stream.ActorMaterializer
import akka.stream.scaladsl.Sink
import akka.util.ByteString
import me.mbcu.crawler.honestbee.ImageCrawl.{DStore, DelayImg, GetImg, QProduct}
import me.mbcu.crawler.honestbee.TextCrawl.ReqParams
import me.mbcu.scala.MyLogging
import org.apache.commons.io.FileUtils
import play.api.libs.json.{JsValue, Json}
import play.api.libs.ws.ahc.StandaloneAhcWSClient

import scala.collection.mutable
import scala.concurrent.{ExecutionContextExecutor, Future}

object ImageCrawl{

  case class DStore(file: File)

  case class DProduct(p: JsValue)

  case class QProduct(storeName: String)

  case class GetImg(storename: String, basename: String)

  case class DelayImg(storename: String, basename: String)

}

class ImageCrawl(jsonPath: String, imgPath: String) extends Actor with MyLogging{
  import scala.concurrent.duration._
  import scala.language.postfixOps


  private implicit val materializer = ActorMaterializer()
  private implicit val ec: ExecutionContextExecutor = global


  private var ws                          = StandaloneAhcWSClient()


  private val qStores : mutable.Queue[File] = mutable.Queue.empty
  private val qProducts: mutable.Queue[JsValue] = mutable.Queue.empty

  override def receive: Receive = {

    case "start" =>
      val jDir = new File(jsonPath)
      qStores ++= jDir.listFiles.filter(_.isFile).toSeq
      self ! "qStores"


    case "qStores" =>
      if (qStores.nonEmpty){
        self ! DStore(qStores.dequeue())
      } else {
        self ! "exit"
      }

    case DStore(file) =>
      info(file.getName)
      val storeName = file.getName
      new File(createFolder(storeName)).mkdir()
      val a = readFile(file)
      qProducts ++= (a \ "products").as[List[JsValue]]
      self ! QProduct(storeName)


    case QProduct(storename) =>
      if (qProducts.nonEmpty){
        val product = qProducts.dequeue()
        val basename = (product \ "product" \ "imageUrlBasename").as[String]
        self ! GetImg(storename, basename)
      } else {
        self ! "qStores"
      }

    case DelayImg(storename, basename) => context.system.scheduler.scheduleOnce(1 second, self, GetImg(storename, basename))

    case GetImg(storename, basename) =>
      get(buildUrl(basename), createFile(storename, basename))
        .map(f=> {self ! QProduct(storename)
        }) recover{case e =>
            error(e.getMessage)
            self ! DelayImg(storename, basename)
       }

  }


  def buildUrl(baseName: String ): String = s"https://assets.honestbee.com/products/images/1024/$baseName"

  def createFolder(storeName: String): String = s"$imgPath$storeName"

  def createFile(storeName: String, baseName: String): String = s"${createFolder(storeName)}/$baseName"

  def get(url: String, target: String): Future[File] = {
    info(url)
    ws.url(url)
      .addHttpHeaders("Accept" -> "application/vnd.honestbee+json;version=2")
      .addHttpHeaders("User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:66.0) Gecko/20100101 Firefox/66.0")
      .withMethod("GET")
      .stream()
      .flatMap{
        res =>
          val t = new File(target)
          val outputStream = java.nio.file.Files.newOutputStream(t.toPath)

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
          }.map(_ => t)
      }
      //      .map(response => respons)


  }


  def readFile(file: File): JsValue = {
    val stream = new FileInputStream(file)
    try {  Json.parse(stream) } finally { stream.close() }
  }
}
