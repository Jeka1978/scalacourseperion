package multiple_inheritance

/**
  * @author Evgeny Borisov
  */
class Scala extends Language with Jvm with Static {
  override var name: String = "scala "
}
