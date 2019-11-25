package implicit_examples.implicit_funciton


/**
  * @author Evgeny Borisov
  */
object Main extends App {


  implicit def convertFromStringToPerson(tuple: Tuple2[String, Int]): Person = {
    Person((tuple._1, tuple._2))
  }

  implicit def convertFromStringToPerson2(name: String): Int = {
    12
  }

  var person: Person = Tuple2("Oleg", 12)

  ("Jeka", 41).printMyAge

}
