package chain_of_responsibility

/**
  * @author Evgeny Borisov
  */
class QuoterAggregator(quoters: List[Quoter]) {

  def printAllQuoters():Unit={
    quoters.foreach(_.printMessage())
  }

}
