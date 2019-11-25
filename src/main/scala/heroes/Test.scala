package heroes

/**
  * @author Evgeny Borisov
  */
class Test {
  private var a = 0

  def age = a

  def age_=(n: Int) = {
    require(n > 0)
    a = n
  }
}

