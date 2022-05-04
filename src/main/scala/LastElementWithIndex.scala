object LastElementWithIndex {
  def findLast(input: List[Any]): List[Any] = {
    val Index = input.length - 1
    val Element = input(Index)
    List(Element,Index)
  }
  def main(args: Array[String]): Unit = {
    val myList = List("Hello", "World", "SCALA", "is", "awesome")
    val List(lastElement,lastIndex) = findLast(myList)
    println("Element:" + lastElement + " Index:" + lastIndex)
  }
}



