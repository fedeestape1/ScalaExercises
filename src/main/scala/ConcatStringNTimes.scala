object ConcatStringNTimes extends App{

  def concatString(aString: String, n: Int): String ={
    def concatHelper(aString: String, n: Int, accumulator: String): String ={
      if(n<=0) accumulator
      else concatHelper(aString, n-1, accumulator + aString)
    }
    concatHelper(aString, n, "")
  }

  println(concatString("Hello", 4))

}
