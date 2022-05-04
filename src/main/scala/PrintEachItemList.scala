object PrintEachItemList
  {
    def main(args: Array[String]): Unit = {
      val list: List[String] = List("Hello", "World", "SCALA", "is", "awesome")
      list.foreach{println}
    }
  }


