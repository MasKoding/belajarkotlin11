fun main(){
    print("enter number of month: ")
//    !! tidak di bolehkan kosong
    var monthOfYear:Int = readLine()!!.toInt()
    var month = when(monthOfYear){
        in 1..3->println("Spring season")
        in 4..6->println("Summer season")
        in 7..8->println("Rainy Season")
        in 9..10->println("Autumn Season")
        in 11..12->println("Winter Season")
        else->println("Enter a valid month")
    }

}