package adapter

/**
  * @author Evgeny Borisov
  */
object Calc {



  def totalPrice(list: List[Pricable]): Int = {
    list.map(_.price()).product
  }
}
