package heroes

import scala.util.Random

/**
  * @author Evgeny Borisov
  */
object RandomUtil {
  def between(min:Int,max:Int):Int={
    Random.nextInt(max-min)+min
  }

}
