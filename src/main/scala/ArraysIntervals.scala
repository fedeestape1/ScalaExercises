object ArraysIntervals extends App {

  def solution(numbers: Array[Int]): Boolean = {
    val number = numbers(4)
    val intervals: Array[(Int, Int)] = Array((numbers(0), numbers(1)), (numbers(2), numbers(3))).sortBy(_._1)

    if (intervals(1)._1 > intervals(0)._2) false
    else if (intervals(1)._2 > intervals(0)._2) ((intervals(0)._2 - intervals(1)._1) + 1 >= number)
    else ((intervals(1)._2 - intervals(1)._1) + 1 >= number)
  }

  println(solution(Array(1,3,3,5,1))) //true
  println(solution(Array(3,5,0,5,3))) //true
  println(solution(Array(11,21,0,5,5))) //false
  println(solution(Array(1,3,1,5,3))) //true
  println(solution(Array(1,5,1,3,4))) //false
}
