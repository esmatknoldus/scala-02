import scala.collection.mutable.Stack

object StackList
{

  def main(args:Array[String])
  {

    val stack = Stack[String]()

    stack.push("Hello")
    stack.push("World")
    stack.push("Scala")
    stack.push("is")
    stack.push("Awesome")
    println(stack.reverse)

    println("Popped:" + stack.pop)
    println("Popped:" + stack.pop)
    println("Popped:" + stack.pop)

  }
}
