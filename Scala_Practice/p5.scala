package Scala_Practice
import scala.io.StdIn.readLine

object p5 {
  def main(args: Array[String]): Unit = {
    val name = readLine("What is your favorite movie of all times?")
    val lowername = name.toLowerCase
    if (lowername == "star wars") println("Wow, mine too!") else println("I'll have to watch that one!")


  }

}
