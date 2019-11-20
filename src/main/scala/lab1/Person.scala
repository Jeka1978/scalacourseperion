package lab1

/**
  * @author Evgeny Borisov
  */

case class Person(name: String, age: Int, salary: Int) {
  def apply(name: String, age: Int, salary: Int): Person = {

    println("person was created!!!")
    new Person(name, age, salary)
  }
}


