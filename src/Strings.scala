/**
  */
object Strings {

  def defineStrings(): Unit = {
    val x = 25
    val s = "6 to 4"
    val e = "ce"
    println(s"String interpolation: $x or $s (or curly bra${e}s)")

    val ha = "ha"
    println(s"Interpolation of code: ${ha * 5} ") // is: ha.* 5

    println(f"Scala allows you to use printf syntax: $ha%.1s.")
  }

  def main(args: Array[String]): Unit = {
    val str = Strings
    defineStrings()
  }

}
