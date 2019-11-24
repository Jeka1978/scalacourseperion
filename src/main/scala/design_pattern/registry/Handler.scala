package design_pattern.registry

/**
  * @author Evgeny Borisov
  */
trait Handler {
  var x=10
  MainHandler.registryNewHandler(this)

  def handle(str: String)

}
