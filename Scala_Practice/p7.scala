package Scala_Practice

object p7 {
  def main(args: Array[String]): Unit = {
    val givenstring = "Vanilla Donut 10 2.25"
    val splitstring = givenstring.split(" ")
    val name = splitstring(0) + " " +splitstring(1)
    val amount = splitstring(2).toInt
    val price = splitstring(3).toDouble

    printout(name, price, amount)

  }

  def printout(x:String, y:Double, z:Int): Unit ={
    println("Output:")
    println("Donut Name: " + s"$x")
    println("Donut Price: " + '$' + f"$y%1.2f")
    println("Donut Purchased: " + s"$z")
  }

}
