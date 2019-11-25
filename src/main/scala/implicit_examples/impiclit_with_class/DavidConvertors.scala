package implicit_examples.impiclit_with_class

/**
  * @author Evgeny Borisov
  */
object DavidConvertors {

  implicit def convert(david: David): Vecheslav = {
    new Vecheslav(david)
  }

  implicit def convert2(david: David): Evgeny = {
    new Evgeny(david)
  }
}
