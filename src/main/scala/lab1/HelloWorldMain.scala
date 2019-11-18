package lab1

/**
  * @author Evgeny Borisov
  */
object HelloWorldMain {
  def main(args: Array[String]): Unit = {

    val yossi = new Person(name = "Yossi", age = 38, salary = 37)
    val sholomo = Person(name = "Yossi", age = 38, salary = 37)
    println(sholomo == yossi)
    println(sholomo.name)
    val person = sholomo.copy(name = "Jeka", age = 41)

    Human(age = 12)
    Human(age = 12)
    Human(age = 12)
    new Human(12)
    new Human(12)

    println(Human.counter)
  }

}
