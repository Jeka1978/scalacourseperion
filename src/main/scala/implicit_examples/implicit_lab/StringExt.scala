package implicit_examples.implicit_lab

/**
  * @author Evgeny Borisov
  */
class StringExt(string: String) {

  def isEmail:Boolean={
    string.contains("@") && string.contains("\\.")
  }
}
