package heroes

import org.reflections.Reflections

import scala.collection.JavaConverters._

/**
  * @author Evgeny Borisov
  */
object HeroFactory {

  val scanner = new Reflections("heroes")
  val heroesClasses = getAllTypes


  private def getAllTypes = {

    val set = scanner.getSubTypesOf(classOf[Hero])
    set.asScala.toList

  }

  def getRandomHero: Hero = {
    val i = RandomUtil.between(0, heroesClasses.size)
    heroesClasses(i).newInstance()
  }

}
