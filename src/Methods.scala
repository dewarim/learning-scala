/**
  */
object Methods{

  def main (args: Array[String]) {
    new Methods().methodExperiments()
  }
}

class Methods {
  
  def methodExperiments() : Unit = {
    val intArray = new Array[Int](3)

    intArray(0) = 1
    intArray(1) = 2
    intArray(2) = 3

    println(" intArray(2) is shorthand for intArray.apply(2)")
    println(intArray(2) + intArray.apply(2))

    // intArray(1) = 4 is shorthand for intArray.update($index,$value)
    intArray(1) = 4
    
    // Arrays can be directly initialized by calling the companion object of 
    // the Array class, which is shorthand for "Array.apply(v*)"
    val anotherArray = Array(1,4,3)
    
    assert(anotherArray.sameElements(intArray))
    
  }

  
}
