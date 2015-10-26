/**
  */
object Naming {

  def defineNames(): Unit = {

    val + = 12 // compiles, but it looks like you cannot use it in expressions. TODO: why is this allowed? Implicit params?

    // you may use ascii chars (Unicode 0020-002F) except parenthesis and periods.
    val $ = 5
    val & = 5

    // does not compile:
    //    val € = 8 // 20AC
    //    val ¥ = 6 // 00A5
    //    val £ = 7 // 00A3

    println("$ plus & = " + ($ + &))

    val || = "This is almost"
    val && = " like brainfuck"
    println (|| + &&)


    var _off_by_one = "Two things in software development are hard: caching, naming things and off-by-one errors"
    println (_off_by_one)
  }

  def main(args: Array[String]) {
    val named = Naming
    named.defineNames()
  }

}
