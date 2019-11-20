package lab1

/**
  * @author Evgeny Borisov
  */
object Main {
  def main(args: Array[String]): Unit = {
    val x: Human.type = Human
    val y: Human = x.apply(10)

  }
}
