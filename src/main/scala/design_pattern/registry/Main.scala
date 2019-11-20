package design_pattern.registry

import org.reflections.Reflections

/**
  * @author Evgeny Borisov
  */
object Main {
  def main(args: Array[String]): Unit = {

//  val scanner = new Reflections("design_pattern")


    PrintHandlerUpperCase
    PrintHandler
    PrintHandler
    PrintHandler
    PrintHandler
    PrintHandler
    PrintHandler
    PrintHandler
    new GoHomeHandler
    new GoHomeHandler
    new GoHomeHandler
    new GoHomeHandler
    new GoHomeHandler
    new GoHomeHandler
    new GoHomeHandler
    new GoHomeHandler
    new GoHomeHandler
    new GoHomeHandler
    new GoHomeHandler
    new GoHomeHandler
    new GoHomeHandler


    MainHandler.handlers.foreach(_.handle("abcc"))


  }
}
