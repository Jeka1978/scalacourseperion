package lab1

/**
  * @author Evgeny Borisov
  */
class Human(age: Int) {


}

object Human {
  var counter = 0

  def apply(age: Int): Human = {
    counter += 1
    new Human(age)
  }
}