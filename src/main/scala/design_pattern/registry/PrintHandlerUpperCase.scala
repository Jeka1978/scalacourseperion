package design_pattern.registry

/**
  * @author Evgeny Borisov
  */
object PrintHandlerUpperCase extends Handler {
  override def handle(str: String): Unit = println(str.toUpperCase)
}
