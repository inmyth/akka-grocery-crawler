package me.mbcu.crawler

import java.io.File

import me.mbcu.crawler.utils.Utils

import scala.io.Source

object Checker extends App{

  val root = new File("./happy")

  def listDirs(f: File) = f.listFiles.filter(_.isDirectory)

  def findProductsMissing() = listDirs(root).map(p => new File(p.getPath + "/products.txt")).filterNot(_.exists())




  listDirs(root).map(p => {
    val ownerId = Utils.readFile(new File(s"${p.getPath}/info.txt"))



  })

}


/*
    val ownerId = (Utils.readFile(new File(s"${p.getPath}/ownerId.txt")) \ "ownerId").as[Int]
    val els = p.getName.split("-").drop(1).mkString(" ")
    (els, ownerId)
 */
