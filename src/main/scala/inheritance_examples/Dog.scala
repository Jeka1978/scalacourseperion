package inheritance_examples

/**
  * @author Evgeny Borisov
  */
class Dog extends Animal {
  override def makeVoice(): Unit = println("au au")
}
