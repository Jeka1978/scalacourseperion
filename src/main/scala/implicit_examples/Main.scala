package implicit_examples

/**
  * @author Evgeny Borisov
  */
import implicit_examples.implicit_val.ImplicitVariables._


object Main {



  def main(args: Array[String]): Unit = {


    def printMe(implicit text: String): Unit = {
      println(text)
    }

    printMe
    printMe
    printMe
    printMe


  }
}
