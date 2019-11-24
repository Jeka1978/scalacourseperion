package multiple_inheritance

/**
  * @author Evgeny Borisov
  */
trait Language {
  var name:String

  override def toString: String = name
}
