package inheritance_examples

/**
  * @author Evgeny Borisov
  */
object Main {
  def main(args: Array[String]): Unit = {
    val cat = new Animal {
      override def makeVoice(): Unit = println("mau mau")
    }
    cat.makeVoice()



  }
}
