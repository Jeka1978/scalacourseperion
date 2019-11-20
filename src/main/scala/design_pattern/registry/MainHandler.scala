package design_pattern.registry

/**
  * @author Evgeny Borisov
  */
object MainHandler {
  var handlers: List[Handler] = Nil

  def registryNewHandler(handler: Handler):Unit = {
    handlers =  handler:: handlers
  }
}
