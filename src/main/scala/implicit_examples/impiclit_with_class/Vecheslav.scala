package implicit_examples.impiclit_with_class

/**
  * @author Evgeny Borisov
  */
class Vecheslav(david: David) {

  def killBill():Unit={
    println("he is already dead")
  }

  def getName():String={
    david.getTheBestNameInTheUniverse().toUpperCase()
  }
}
