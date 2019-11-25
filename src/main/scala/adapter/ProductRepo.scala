package adapter

/**
  * @author Evgeny Borisov
  */
object ProductRepo {

  def getProduct():Costable={
    new Chair(12)
  }
}
