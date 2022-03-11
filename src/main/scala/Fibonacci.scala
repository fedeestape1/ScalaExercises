import scala.collection.mutable.ArrayBuffer

object Fibonacci extends App {

  def solution1(number: Int): Int = {
    val arr = new Array[Int](number+1)
    for(i <- 0 to number) {
      if (i == 0 || i == 1)
        arr(i) = 1
      else
        arr(i) = arr(i - 1) + arr(i - 2)
    }
    return arr(number - 1)
  }

  println(solution1(4))

  def solution2(number: Int): Int = {
    if(number == 1 || number == 2) 1 else solution2(number - 1) + solution2(number - 2)
  }

  println(solution2(5))

}
