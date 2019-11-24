package chain_of_responsibility

/**
  * @author Evgeny Borisov
  */
case class MessageQuoter(private val message: String="") extends Quoter {
  override def printMessage(): Unit = {
    println(message.toUpperCase())
  }
}
