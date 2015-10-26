/**
  */
object Vars {

  def defineVars(): Unit = {
    val short: Int = 0xFF.toShort * 127.toShort
    println ("multiply: " + (short * short * short * short).equals(-108037631))
  }

  def main(args: Array[String]): Unit = {
    val vars = Vars
    vars.defineVars()
  }

}
