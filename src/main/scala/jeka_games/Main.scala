package jeka_games

/**
  * @author Evgeny Borisov
  */
object Main {
  final def foreach[U](f: Int => U): Unit = {

  val strings = List("","A")


  }





  def main(args: Array[String]): Unit = {
    val strings = List("aa", "bb", "ccc", "dd")
    val intToStrings = strings.filter(!_.contains("a")).map(_.toUpperCase).groupBy(_.length)
    println(intToStrings)
    intToStrings.foreach(printPair(_))
  }

  def printPair(pair: Tuple2[Any, Any]): Unit = {
    println(pair._1, pair._2)
  }

  //  @inline final override def foreach(f: Int => _) {
  //    var these = this
  //    while (!these.isEmpty) {
  //      f(these.head)
  //      these = these.tail
  //    }
  //  }
}
