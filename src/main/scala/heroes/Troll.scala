package heroes

/**
  * @author Evgeny Borisov
  */
class Troll extends Hero {
  override var power: Int = 100
  override var hp: Int = 100

  override def kick(enemy: Hero): Unit = println("TROLL IS SUPER STRING")
}
