package Scala_Practice
import Console.{BOLD, RESET, UNDERLINED}
import scala.io.StdIn.{readInt, readLine}

object p2 {
  def main(args: Array[String]): Unit = {
    val name = readLine("Please enter your name: ")
    println("Please enter your age: ")
    val age = readInt()
    Console.println(s"${BOLD}Name:${RESET} ${UNDERLINED}$name${RESET}")
    Console.println(s"${BOLD}Age:${RESET} $age")

  }

}
