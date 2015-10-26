/*
 * Learning the syntax
 */
object HelloWorld extends App{

  override def main(args: Array[String]) {

    // val'ues are final:
    val finalString: String = "Hello"

    // var'iables are variable and can be assigned again with the same type:
    var space = "<space>"
    space = " "

    var variable = "World"
    println(finalString + space + variable + "\n") // String concatenation works like in Java, it seems.

    val unformattedMultiline =
      """A Multiline without
the benefit of indentation          
cleanup. Like in Groovy.        
      """
    println(unformattedMultiline)

    val multiline =
      """
        |A Multiline String
        |that goes over two lines
        |and ignores indentation so the source code layout is not messed up.
      """.stripMargin
    println("\nThe following is a multiline String:\n" + multiline + "\n")

    println(concat("foo", "bar"))

    println(singleLineFunction(null, "not-null"))
    println(singleLineFunction("not-null", " not-null-too"))

  }

  /**
   * Function definition: like with simple variable definitions, the return type is appended with :$type to the 
   * signature
   * @param s1 the first string
   * @param s2 the second string
   * @return the combined string of first + second.
   */
  def concat(s1: String, s2: String): String = {
    return s1 + s2
  }

  /*
   * Defining the return type is optional if the compile can "see" what you did there:
   */
  def filterNull(a: String, b: String) = {
    if (a == null) {
      b
    }
    else if (b == null)
      a // Scala also has the ugly one-line if-statements without braces, which no sane man would use.
    else
    // Danger: this else belongs to the b==null check, and can never be called. Comment it out if you want to 
    // see the following sentence:
      "Why do you call me for filtering if you got no nulls?"
  }

  /*
   * You can also define functions in a single line. I guess this makes Perl one-liners possible in Scala ;)
   * Also: should be only used for extremely simple functions.
   */
  def singleLineFunction(a: String, b: String) = if (a != null && b != null) concat(a, b) else filterNull(a, b)

}
