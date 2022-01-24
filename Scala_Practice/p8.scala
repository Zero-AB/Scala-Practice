package Scala_Practice

import scala.collection.mutable.ArrayBuffer


object p8 {
  def main(args: Array[String]): Unit = {
    val childages = Map("Bill"-> 9, "Jonny"->8, "Tommy"->11, "Cindy"->13)
    val seq = childages.keys.toSeq
    val sorted = seq.sorted(Ordering.String.reverse)
    var counter = 0

    println("Output:")
    print("Children to ages in reverse order by their names = ")
    for(name<-sorted) {
      counter = counter + 1
      print(name + " -> " + childages(name))
      if(counter<sorted.length) print(", ") else println()
    }

  }


}
