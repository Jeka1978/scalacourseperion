package chain_of_responsibility

/**
  * @author Evgeny Borisov
  */
case class Person(var age:Int) {

  def age(newAge:Int):Person={
    new Person(newAge)
  }
}
