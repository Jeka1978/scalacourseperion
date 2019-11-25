package implicit_examples.implicit_funciton

/**
  * @author Evgeny Borisov
  */
case class Person(tuple2: Tuple2[String,Int]) {
  val name:String=tuple2._1
  val age=tuple2._2

  def printMyAge():Unit=println(age)
}
