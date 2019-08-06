package me.mbcu.crawler

import java.io.File

object Checker extends App{

  def findProductsMissing() = {
    val root = "./happy"
    val jDir = new File(root)
    jDir.listFiles.filter(_.isDirectory).map(p => new File(p.getPath + "/products.txt")).filterNot(_.exists())
  }

  findProductsMissing().foreach(println)
}



