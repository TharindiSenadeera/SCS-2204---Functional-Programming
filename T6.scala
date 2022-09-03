object T6 {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  def main(args: Array[String]): Unit = {

    val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size
    val inputText = scala.io.StdIn.readLine("Secret Message: ")

    val enc = encryption(inputText, shift)
    println("Encrypted message = " + enc)

    val  dec = decryption(enc, shift)
    println("Decrypted message = " + dec)

  }

  def encryption(text : String, shift : Int): String = {
    val outputText = text.map( (c: Char) => {

      val x = alphabet.indexOf(c.toUpper)
      if (x == -1){
        c
      }
      else{
        alphabet((x + shift) % alphabet.size)
      }
    });

    return outputText

  }

  def decryption(text : String, shift : Int): String = {
    val outputText = text.map( (c: Char) => {

      val x = alphabet.indexOf(c.toUpper)
      if (x == -1){
        c
      }
      else{
        alphabet((x - shift) % alphabet.size)
      }
    });

    return outputText

  }

}
