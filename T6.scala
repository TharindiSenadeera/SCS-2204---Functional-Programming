object T6 {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val encryption = (c:Char, shift:Int, x:String) => x((x.indexOf(c.toUpper)+shift)%x.size)

  val decryption = (c:Char, shift:Int, x:String) => x((x.indexOf(c.toUpper)-shift)%x.size)

  val cipher = (algo:(Char, Int, String) => Char, s:String, shift:Int, x:String) => s.map(algo(_,shift,x))


  def main(args: Array[String]): Unit = {

    val inputText = scala.io.StdIn.readLine("Secret Message: ")

    val enc = cipher(encryption,inputText,3,alphabet)
    println("Encrypted message = " + enc)

    val  dec = cipher(decryption,enc,3,alphabet)
    println("Decrypted message = " + dec)

  }



}
