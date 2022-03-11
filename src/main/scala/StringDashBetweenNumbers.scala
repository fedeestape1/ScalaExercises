import scala.collection.mutable.ArrayBuffer

object StringDashBetweenNumbers extends App{

  def solution(word2: String) = {
    val filter1 = word2.replace(" ", "")
    val word = filter1.replace("-", "")

    val wordGroups = ArrayBuffer[String]()
    if(word.length() % 3 == 0){
      for(i <- word.indices by 3){
        wordGroups += word.substring(i, i + 3)
      }
    } else if (word.length() % 3 == 2){
      for(i <- 0 to word.length - 3 by 3){
        wordGroups += word.substring(i, i + 3)
      }
      wordGroups += word.substring(word.length - 2, word.length)
    } else {
      for(i <- 0 to word.length - 5 by 3){
        wordGroups += word.substring(i, i + 3)
      }
      wordGroups += word.substring(word.length - 4, word.length - 2)
      wordGroups += word.substring(word.length - 2, word.length)
    }
    wordGroups.mkString("-")
  }

  println(solution("   5 -1   9    0   234"))
  println(solution("   1 -2   3"))
  println(solution("1 -2   34"))
  println(solution("1 -2   "))
}
