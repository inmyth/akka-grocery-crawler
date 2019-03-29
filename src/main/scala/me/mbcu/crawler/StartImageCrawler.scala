package me.mbcu.crawler

import java.util.TimeZone

import akka.actor.{ActorSystem, Props}
import akka.stream.ActorMaterializer
import me.mbcu.crawler.honestbee.{ImageCrawl}
import me.mbcu.scala.MyLoggingSingle

object StartImageCrawler  extends  App{

  implicit val system: ActorSystem = akka.actor.ActorSystem("crawler")
  implicit val materializer: ActorMaterializer = akka.stream.ActorMaterializer()
  MyLoggingSingle.init("./log/", TimeZone.getTimeZone("Asia/Tokyo"))
  val mainActor = system.actorOf(Props(new ImageCrawl("./json/", "./img/")), name = "main")
  mainActor ! "start"

}
