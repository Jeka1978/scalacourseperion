package multiple_inheritance

/**
  * @author Evgeny Borisov
  */
object Main {
  def main(args: Array[String]): Unit = {
//    val scala = new Scala
//    println(scala)
    val child = new Child
    child.talkToChildren()
  }
}
