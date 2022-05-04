import scala.collection.mutable.Queue

object QueueList
{
  def main(args:Array[String])
  {

    val queue = Queue[String]()


    queue.enqueue("Hello")
    queue.enqueue("World")
    queue.enqueue("Scala")
    queue.enqueue("is")

    print("Queue Elements: ")
    queue.foreach((element:String) => print(element+" "))


    val firstElement = queue.front
    println("\nFirst element in the queue: "+ firstElement)


    queue.enqueue("Awesome")

    print("Queue Elements after enqueue: ")
    queue.foreach((element:String) => print(element+" "))

    val deq = queue.dequeue

    print("\nQueue Elements after dequeue: ")
    queue.foreach((element:String) => print(element+" "))

    print("\nDequeued element: " + deq)

    println("\nclear the queue: "+ queue.clear)

    println("\nqueue is empty: "+ queue.isEmpty)

  }
}