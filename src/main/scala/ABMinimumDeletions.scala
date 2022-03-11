object ABMinimumDeletions extends App{
  def solution(input: String) = {
    var lastChar = input(0)
    var minimumDeletions = 0
    for(currentChar <- input.substring(1)){
      if(currentChar == lastChar){
        minimumDeletions += 1
      }
      lastChar = currentChar
    }

    minimumDeletions
  }

  println(solution("AAABBABB"))
}
