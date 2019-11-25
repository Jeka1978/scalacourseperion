package heroes

/**
  * @author Evgeny Borisov
  */
class Hobbit extends Hero {
  override var power: Int = 0
  override var hp: Int = 3

  private def cry(): Unit = println("aaauua ua ua")

  override def kick(hero: Hero): Unit = {
    cry()
  }
}
