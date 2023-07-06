object MyApp extends App {
  val depositAmount: Double = 50000
  val interest: Double = if (depositAmount <= 20000) {
    depositAmount * 0.02
  } else if (depositAmount <= 200000) {
    depositAmount * 0.04
  } else if (depositAmount <= 2000000) {
    depositAmount * 0.035
  } else {
    depositAmount * 0.065
  }
  println(s"The interest earned on Rs. $depositAmount is Rs. $interest")
}
