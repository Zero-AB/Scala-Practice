package Scala_Practice

object p10 {
  def main(args: Array[String]): Unit = {
    val nums = Seq.range(100,111)

    println("Output:" + "\n")
    print("Number range from 100 to 110 inclusive = ")
    nums.foreach{ i => print(i + " ")}


  }

}
