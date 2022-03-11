import scala.annotation.tailrec
import scala.collection.IterableOnce.iterableOnceExtensionMethods
import scala.collection.mutable.ListBuffer

object ReverseList extends App{

  def reverse(list: List[Int]): List[Int] ={
    @tailrec
    def reverseHelper(list: List[Int], accumulator: List[Int]): List[Int] =
      if(list.isEmpty) accumulator
      else reverseHelper(list.slice(0,list.size - 1), accumulator :+ list.last)
    reverseHelper(list, List())
  }

  println(reverse(List(1,2,3,4)))

  def reverse2(list: List[Int]): List[Int] ={
    var result: ListBuffer[Int] = collection.mutable.ListBuffer()
    for(i <- (list.size - 1) to 0 by -1){
      result += list(i)
    }
    result.toList
  }

  println(reverse2(List(1,2,3,4)))
}
