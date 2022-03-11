object PlayerRanks extends App{

  println(solution(3, List(100, 25, 50, 50)))

  def solution(k: Int, scores: List[Int]): Int = {
    var i = 0
    var lastScore = 0
    var rank = 0
    var qualifiers = 0
    scores.sorted(Ordering[Int]).foreach(score => {
      i += 1
      if (score != lastScore){
        rank = i
      }
      lastScore = score
      if(rank <= k){
        qualifiers += 1
      }
    })
    qualifiers
  }
}

