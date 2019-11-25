package heroes

/**
  * @author Evgeny Borisov
  */
trait Hero {

  var power: Int
  var hp: Int

  def isAlive: Boolean = hp > 0

  def kick(enemy: Hero)


}
