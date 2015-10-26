import scala.util.matching.Regex

/**
  */
object RegularExpressions {

  def defineRE(): Unit = {
    val input = "For some programmers, there are 3 types of boolean values: true, false, null (aka maybe)."

    // Appending a .r to a String will define this as a regex
    val vowelPattern: Regex = """.*(\d+) types.*""".r // you can also use the short definition without ": Regex"

    val vowelPattern(matches) = input
    println (s"Types of programmers: $matches")

    // TODO: can we use the pattern to match multiple result / part of the String as easily?
  }

  def main(args: Array[String]): Unit = {
    val regex = RegularExpressions
    regex.defineRE()
  }

}
