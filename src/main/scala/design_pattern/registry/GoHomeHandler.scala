package design_pattern.registry

/**
  * @author Evgeny Borisov
  */
class GoHomeHandler extends Handler {
  override def handle(str: String): Unit = println("go home!")
}
