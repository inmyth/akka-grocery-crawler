package me.mbcu.crawler

import java.util.TimeZone

import akka.actor.{ActorSystem, Props}
import akka.stream.ActorMaterializer
import me.mbcu.crawler.honestbee.TextCrawl
import me.mbcu.scala.MyLoggingSingle

object StartTextCrawler extends App {

  implicit val system: ActorSystem = akka.actor.ActorSystem("crawler")
  implicit val materializer: ActorMaterializer = akka.stream.ActorMaterializer()
  MyLoggingSingle.init("./log/", TimeZone.getTimeZone("Asia/Tokyo"))
  val mainActor = system.actorOf(Props(new TextCrawl("./json/")), name = "main")
  mainActor ! "start"

}
