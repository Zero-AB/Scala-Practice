package Scala_Practice

object p1 {
  def main(args: Array[String]): Unit = {
    val n1 = "donut_name"
    val donutname = "Vanilla Donut"
    val n2 = "quantity_purchased"
    val quantity = "10"
    val n3 = "price"
    val price = 2.5
    println("Output: ")
    println("{")
    println('"' + s"$n1" + '"' + ":" +'"'+s"$donutname"+'"'+"," )
    println('"' + s"$n2" + '"' + ":" +'"'+s"$quantity"+'"'+"," )
    println('"' + s"$n3" + '"' + ":" +s"$price" )
    println("}")
  }

}
