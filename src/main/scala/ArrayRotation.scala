object ArrayRotation extends App{
  def solution(arr: Array[Int], d: Int) = {
    val result = Array.from(arr)
    for(i <- arr.indices){
      result(i) = arr((i+d) % arr.length)
    }
    result
  }

  val result = solution(Array(1,2,3,4,5), 3)
  result.foreach(elem => println(elem))
}
