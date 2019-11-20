package inheritance_examples

/**
  * @author Evgeny Borisov
  */
abstract class Animal {
  def makeVoice(): Unit

  def breathe():Unit={
    println("I'm alive")
  }
}
