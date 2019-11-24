package chain_of_responsibility

/**
  * @author Evgeny Borisov
  */
object Main {


  def main(args: Array[String]): Unit = {


    new ShakespeareQuoter()
    RandomQuoter
    MessageQuoter("good to die for our country")


    QuoterAggregator.printAllQuoters()

  }

}
