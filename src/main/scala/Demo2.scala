object Demo2 {
    def filterStrings(list: List[String]): List[String] = {
      list.filter(_.length > 5)
    }

    def main(args : Array[String]): Unit = {
      val inputList = List("apple", "banana", "orange", "papaya", "pineapple", "avacado")
      val outputList = filterStrings(inputList)
      println(outputList)
    }

}
