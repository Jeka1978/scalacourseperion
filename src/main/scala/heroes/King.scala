package heroes

/**
  * @author Evgeny Borisov
  */
class King extends Hero {
  override var power: Int = RandomUtil.between(5,15)
  override var hp: Int = RandomUtil.between(5,15)

  var weapon:Weapon = new Sword

  override def kick(enemy: Hero): Unit = weapon.kick(this,enemy)
}
