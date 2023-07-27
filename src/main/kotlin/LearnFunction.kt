
fun sayHello(name:String){
    println("Hello $name")
}
// parameternya wajib di isi
//fun sayGoodluck(firstName:String,lastName:String){
//    println("Goodluck $firstName $lastName")
//}
// default parameter bisa kita isi di awal sehingga
// tidak perlu dipanggil
fun sayGoodluck(firstName:String,lastName:String=""){
    println("Goodluck $firstName $lastName")
}

fun sayGoodBye(firstName:String,lastName:String=""){
    println("GoodBye $firstName $lastName")
}

fun main(){
    sayHello("Steve")
    sayGoodluck("Steve","Job")
    sayGoodluck("Daud")
    sayGoodBye("Ahmad")
}
