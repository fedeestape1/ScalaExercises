import scala.annotation.tailrec

object Factorial extends App{

  def factorial(n: Int): Int = {
    @tailrec
    def factHelper(num: Int, accumulator: Int): Int =
      if(num <= 1) accumulator
      else factHelper(num - 1, num * accumulator)

    factHelper(n, 1)
  }

  println(factorial(50))
}
