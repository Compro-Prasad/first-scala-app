import Math._

object Test {
  def isPrime(n : Int): Boolean = {
    lazy val x = Math.sqrt(n).toInt
    if (n < 2)
      false
    else if (n == 2)
      true
    else
      (3 to x by 2).exists(i => n % i == 0)
  }

  def main(args : Array[String]) {
    val n = 10
    var i = 0
    while (i < n) {
      println(s"$i = ${isPrime(i)}")
      i += 1
    }
  }
}
