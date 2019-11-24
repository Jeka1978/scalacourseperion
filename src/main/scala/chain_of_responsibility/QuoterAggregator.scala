package chain_of_responsibility

/**
  * @author Evgeny Borisov
  */
object QuoterAggregator {

  var quoters: List[Quoter] = Nil

  def addQuoter(quoter: Quoter): Unit = {
    quoters = quoter :: quoters
  }

  def printAllQuoters(): Unit = {
    quoters.foreach(_.printMessage())
  }

}
