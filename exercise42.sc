object exercise42 {

	def main(args: Array[String]) {
		println(factorial(4))
		println(factorial(5))
   }                                              //> main: (args: Array[String])Unit

	def factorial(n: Int): Int = {
  		if (n == 0)
    		return 1
    	else
      return n * factorial(n - 1)
   }                                              //> factorial: (n: Int)Int
}