object AllPermutationsOfAlphabet extends App {

  def allPermutations(alphabet: String, sb: StringBuilder): Unit = {
    if(sb.size.equals(alphabet.length)) {
      println(sb.toString())
    } else{
      for(char <- alphabet){
        sb.append(char)
        allPermutations(alphabet, sb)
        sb.deleteCharAt(sb.size -1)
      }
    }
  }

  allPermutations("abc", new StringBuilder())
}
