package lab1

/**
  * @author Evgeny Borisov
  */
object PersonCreator {

  def apply(name: String, age: Int, salary: Int):Person={
    return new Person(name,age,salary)
  }
}
