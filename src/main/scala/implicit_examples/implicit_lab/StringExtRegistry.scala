package implicit_examples.implicit_lab

/**
  * @author Evgeny Borisov
  */
class StringExtRegistry {



 implicit def convertStringToStringExt(string: String):StringExt={
    new StringExt(string)
  }
}
