object Q1 extends App {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val message = scala.io.StdIn.readLine("Enter the secret message: ")
  val shift = (scala.io.StdIn.readLine("Shift number: ").toInt + alphabet.length) % alphabet.length

// Encryption
  val Encryption = (shift:Int)=>message.map( (c: Char) => {
    val x = alphabet.indexOf(c.toUpper)
    if (x == -1) c
    else alphabet((x + shift + alphabet.length) % alphabet.length)
  })

//Decryption
  val Decryption = (shift:Int)=>message.map( (c: Char) => {

    val x = alphabet.indexOf(c.toUpper)
    if (x == -1) c
    else alphabet((x - shift + alphabet.length) % alphabet.length)
  })

  println("Select operation(1 / 2)")
  println("1.Encryption\n2.Decryption")

  val choice=scala.io.StdIn.readInt()

  if(choice==1) println("Encrypted message: "+ Encryption(shift))

  else println("Decrypted message: "+ Decryption(shift))
}
