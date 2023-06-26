object Demo3 {
  def average(num1: Int, num2: Int): Float = {
    BigDecimal((num1.toFloat+num2.toFloat)/2).setScale(2,BigDecimal.RoundingMode.HALF_UP).toFloat;
  }

  def main(args: Array[String]): Unit = {
    println("Rounded number : ", average(234, 31));
  }
}
