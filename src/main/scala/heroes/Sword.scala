package heroes

/**
  * @author Evgeny Borisov
  */
class Sword extends Weapon {
  override def kick(attacker: Hero, defender: Hero): Unit = {
    println("I kicked you with a sword")
  }
}
