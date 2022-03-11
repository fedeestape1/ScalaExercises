object WordCount extends App {
  def solution(words: List[String]) = {
    val frequencies = collection.mutable.Map[String, Int]().withDefaultValue(0)
    for(word <- words){
      frequencies(word) = frequencies(word) + 1
    }
    val maxFrequency = frequencies.values.max
    var maxFirstFrequencyWord = ""
    var found = false
    for(word <- words){
      if(frequencies(word) == maxFrequency && !found) {
        maxFirstFrequencyWord = word
        found = true
      }
    }
    (maxFirstFrequencyWord, frequencies)
  }

  println(solution(List("messi", "ronaldo", "rafa", "rafa", "messi", "messi", "rafa")))
}
