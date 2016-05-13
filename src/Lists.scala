import scala.util.Random

/**
  * Created by ingo on 13.05.16.
  */
object Lists {

  def immutableList(): Unit = {
    val numbers = List(1, 2, 3, 4)
    val moreNumbers = List(5, 6)

    val combinedList = numbers ::: moreNumbers
    println(s"concat operator ':::' combines two lists: $combinedList")

    val withZero = 0 :: combinedList
    println(s"cons operator '::' prepends an element: $withZero")

    println("Note: :: is a method on the _right_ operand, whose argument is to the left.")
    val nilIsEmptyList = 1 :: 2 :: 3 :: Nil
    println(s"Nil is the empty list, and to this we prepend the other elements of 1::2::3::Nil for: $nilIsEmptyList")

    //    var onTheRange = Nil // Note: cannot make an untyped List for the following.
    var onTheRange: List[Int] = Nil
    Range.Int(0, 10, 1).foreach { i =>
      onTheRange = i :: onTheRange
    }
    println(s"To append, the Scala book recommends using '.reverse' after prepending. ${onTheRange.reverse} (or use a" +
      s" ListBuffer)")

    
    val countElementsWithFilter = onTheRange.count(i => i > 5)
    println(s"$countElementsWithFilter elements in 0..9 are larger than 5")
    
    val droppedList = onTheRange.drop(5)
    println(s"list.drop(n): return a new list without the first n elements: $droppedList")
    println(s"list.dropRight(n): return a new list without the last n elements: ${droppedList.dropRight(4)}")
    
    // boolean operations
    val l = List(1,2,3)
    
    l.exists(i => i > 2) // check if an element matching a condition exists 
    l.filter(i => i < 3) // return a list of elements matching the condition
    l.forall(i => i % 2 == 0) // check if all elemnts match a condition
    l.head // return first element
    l.init // return new list without last element
    l.tail // return new list without first element
    l.last // return just the last element
    l.isEmpty // true if length == 0
    l.map(i => i+1) // return a list of transformed elements.
    l.foreach(i => println(i)) // perform action for each element
//    l.remove( i => i != 3) // appears in Scala book, but has been deprecated in favor of
    l.filterNot(i => i == 3) // filter all elements which do not satisfy the condition
//    l.sort((s,t) => s < t) also removed, replaced by sortWith
    var random: List[Int] = Nil
    onTheRange.foreach{ i =>
      random = Random.nextInt(100) :: random
    }
    println(s"sorted random numbers: ${random.sortWith((l,r) => l < r)}")
    // short form:
    random.sortWith(_<_)
    
    var randomBoxes : List[Box] = random.map(i => new Box(i))
    
    println(s"sorted by field: ${randomBoxes.sortBy(_.id)}")
    println(s"implicit sort: ${random.sorted}")
  }

  class Box(val id : Int){

    override def toString = s"Box($id)"
  }
  
  def main(args: Array[String]) {
    immutableList()
  }

}
