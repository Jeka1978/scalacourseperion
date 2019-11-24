package multiple_inheritance

/**
  * @author Evgeny Borisov
  */
trait Static {
  override def toString: String = super.toString + " is static"

}
