package heroes

/**
  * @author Evgeny Borisov
  */
object Main {
  def main(args: Array[String]): Unit = {

   val hero = HeroFactory.getRandomHero

    hero.kick(hero)
  }
}
