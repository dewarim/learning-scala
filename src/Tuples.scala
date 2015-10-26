/**
  * tuple: an arbitrary structure of elements defined with parenthesis:
  * (element1, element2, ... n)
  *
  */
object Tuples {

  def tupelize() = {

    val rings = List((3, "Elven-kings"), (7, "Dwarf-lords"), (9, "Mortal Men"), (1, "Dark Lord"))
    println("Ring wielders:")
    for (i <- rings) {
      println(i._2)
    }

    // a for-loop that returns a list, much like Groovy's foo.collect{}
    val reverseTuple = for (x <- rings) yield {
      (x._2, x._1)
    }

    // TODO: convert to HashMap; "sort 'n' yield"?

  }

  def main(args: Array[String]) = {
    tupelize()
  }

}
