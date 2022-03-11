object FibonacciTailrec extends App{
  def fibonacci(n: Int): Int = {
    def fibonacciTailrec(i: Int, last: Int, prevToLast: Int): Int = {
      if (i >= n) last
      else fibonacciTailrec(i + 1, last + prevToLast, last)
    }
    if(n<=2) 1
    else fibonacciTailrec(2, 1, 1)
  }

  println(fibonacci(50))
}
