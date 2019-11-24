package chain_of_responsibility

/**
  * @author Evgeny Borisov
  */
object Main {


  def main(args: Array[String]): Unit = {

    val aggregator = new QuoterAggregator(List(RandomQuoter,
      MessageQuoter("good to die for our country"),
      new ShakespeareQuoter()))
    aggregator.printAllQuoters()

  }

}
