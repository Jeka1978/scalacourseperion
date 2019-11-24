package chain_of_responsibility

/**
  * @author Evgeny Borisov
  */
final class ShakespeareQuoter(message: String = "2 B || ! 2 B") extends Quoter {
  override def printMessage(): Unit = {
    println(message)
  }
}
