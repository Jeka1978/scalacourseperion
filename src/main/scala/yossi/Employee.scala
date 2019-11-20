package yossi

/**
  * @author Evgeny Borisov
  */
class Employee(var salary:Int) {
  if(salary<20) {
    throw new IllegalStateException("salary too law")
  }


  def plus(a:Int, b:Int): Unit ={

  }
}
