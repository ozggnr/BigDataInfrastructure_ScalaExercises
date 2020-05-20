object exercise43 {
	def main(args: Array[String]) {
		val x = 4.3
		val y = x.toInt
		println(factorial(y))

   }                                              //> main: (args: Array[String])Unit

	def factorial(n: Double): Double = {
  		if (n == 0)
    		return 1
    	else
      return n * factorial(n - 1)
   }                                              //> factorial: (n: Double)Double
}