/**
  * Created by ingo on 13.05.16.
  */
object Arrays {

  def mutableArray(): Unit = {

    val numbers = Array(1, 2, 3)
    numbers.foreach(println(_))
    numbers.update(2, 4)
    numbers.update(1, 5)
    numbers.update(0, 6)
    numbers.reverse.foreach(println(_))
  }
  
  def main(args: Array[String]) {
    mutableArray()
  }
}
