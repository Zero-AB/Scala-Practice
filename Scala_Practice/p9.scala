package Scala_Practice

object p9 {
  def main(args: Array[String]): Unit = {

    val basket1 = List("Cake","Milk","Cheese","Toilet Paper")
    val basket2 = List("Water","Milk","Juice","Cheese","Bread")
    val commonitems = basket1.intersect(basket2)
    var counter1 = 0
    var counter2 = 0
    var counter3 = 0

    println("Output:")
    print("Shopping Basket One = ")
    for(item1<-basket1) {
      counter1 = counter1 + 1
      print(item1)
      if(counter1<basket1.length) print(" - ") else println()
    }
    print("Shopping Basket Two = ")
    for(item2<-basket2) {
      counter2 = counter2 + 1
      print(item2)
      if(counter2<basket2.length) print(" - ") else println()
    }
    print("Common items are: ")
    for(item3<-commonitems) {
      counter3 = counter3 + 1
      print(item3)
      if(counter3<commonitems.length) print(" - ") else println()
    }


  }

}
