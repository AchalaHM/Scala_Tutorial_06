object Caesar_Cipher extends App {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val inputText = scala.io.StdIn.readLine("Secret Word/Letter: ")
  val shift = scala.io.StdIn.readLine("Shift By: ").toInt

  val Encrypt = (c:Char, key :Int , a : String) => a((a.indexOf(c.toUpper)+key)%a.size) //  Encryption function
  val Decrypt = (c:Char, key :Int , a : String) => a((a.indexOf(c.toUpper)-key)%a.size)// Decryption function

  val cipher=(algo:(Char,Int,String)=> Char,s:String,key:Int,a:String)=> s.map(algo(_,key,a))

  val ct=cipher(Encrypt,inputText,shift,alphabet)
  val pt=cipher(Decrypt,ct,shift,alphabet)

  println(ct)
  println(pt)
}
