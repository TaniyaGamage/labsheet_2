object Demo1 {
  def reverseString(str: String): Unit = {
    if(str.length == 1){
      print(str);
    }else{
      System.out.print(str.charAt(str.length - 1))
      reverseString(str.substring(0, str.length - 1))
    }
  }

  def main(args: Array[String]): Unit = {
    reverseString("Hello World");
  }
}
