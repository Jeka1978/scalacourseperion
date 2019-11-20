package design_pattern.registry

/**
  * @author Evgeny Borisov
  */
object PrintHandler extends Handler {
  override def handle(str: String): Unit = println(str)
}
