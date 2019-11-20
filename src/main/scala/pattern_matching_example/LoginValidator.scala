package pattern_matching_example

/**
  * @author Evgeny Borisov
  */
object LoginValidator {


  def validate(login: Any): String = {

    //login =("admin","jeka","jeka")

    login match {
      case NewLogin("admin", _, _) => "admin can't be user name"
      case NewLogin(_, pass, _) if pass.startsWith("z") => "password can't start from 'z'"
      case NewLogin(userName, pass, _) if pass == userName => "username can't = password"
      case NewLogin(_, pass, _) if pass.forall(_.isDigit) => "password can't start from digit"
      case NewLogin(_, pass, conf) if pass != conf => "pass not like confirmation"
      case "asd" => "OK"
      case _ => "OK"
    }
  }
}







