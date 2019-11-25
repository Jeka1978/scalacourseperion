package implicit_examples.implicit_lab

/**
  * @author Evgeny Borisov
  */
object Main {
  def main(args: Array[String]): Unit = {
    val registry = new StringExtRegistry
    import registry.convertStringToStringExt
    val s = "java"
    s.isEmail
  }
}
