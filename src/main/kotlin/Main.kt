const val APP= "belajarkotlin"
const val VERSION="1.0.0"
const val AUTHOR="Steve"
fun main(args: Array<String>) {

    val nama:String="Steve"
    var angka:Int=123
    var angka2:Int=456

    var nickname = nama.lowercase()+angka+angka2
    var nicknamePlus = nama.lowercase()+(angka+angka2)
    println("App Name : $APP  Version: $VERSION  Author: $AUTHOR")
    println(nickname) // tampilnya menjadi steve123456
    println(nicknamePlus) // steve579
}