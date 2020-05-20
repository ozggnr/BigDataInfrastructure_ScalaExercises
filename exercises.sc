object exercises {
  val x: Double = 42.354562                       //> x  : Double = 42.354562
  val y: Int = 3                                  //> y  : Int = 3
  val z = BigDecimal(x).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
                                                  //> z  : Double = 42.35
  val k = "%04d".format(y)                        //> k  : String = 0003
  //val p = y.toString.reverse.padTo(4, '0').reverse
  println(z, k)                                   //> (42.35,0003)
}