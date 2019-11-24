package chain_of_responsibility

import com.github.javafaker.Faker

/**
  * @author Evgeny Borisov
  */
object RandomQuoter extends Quoter {

  private val faker = new ScalaFaker()


  override def printMessage(): Unit = {
    val quote = faker.chuckNorris().fact()
    println(quote)
  }
}
