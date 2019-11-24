package chain_of_responsibility

/**
  * @author Evgeny Borisov
  */
trait Quoter {
  QuoterAggregator.addQuoter(this)


  def printMessage(): Unit
}
