package multiple_inheritance

/**
  * @author Evgeny Borisov
  */
trait Jvm {
  override def toString: String = super.toString + "run on JVM"
}
