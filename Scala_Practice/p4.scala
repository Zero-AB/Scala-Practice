package Scala_Practice

object p4 {
  def main(args: Array[String]): Unit = {
    val numofdones = 10
    val costofdones = glazedcalc(numofdones)
    print("The cost of " + s"$numofdones" + " glazed donuts is " + '$' + f"$costofdones%1.2f" )

  }

  def glazedcalc(x:Int):Double = {
    x * 2.50
  }

}
