package heroes

/**
  * @author Evgeny Borisov
  */
class Elf extends Hero {
  override var power: Int = 10
  override var hp: Int = 10

  override def kick(enemy: Hero): Unit = {
    println("elf kicks")
    if(enemy.power<power) {
      enemy.hp=0
    }
    else {
      enemy.power-=1
    }
  }
}
