package multiple_inheritance

/**
  * @author Evgeny Borisov
  */
class Child extends Father with Mother {
  override def talkToChildren(): Unit = {
    println("I'm a child by myself")
    super.talkToChildren()
  }
}
