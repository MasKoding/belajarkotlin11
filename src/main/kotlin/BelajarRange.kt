fun main(){
    var range1 = 100 downTo 1
    var range2 = 1..100
    var rangeGenap = 2 ..100 step 2

    var n=8
    for(i in 1..n){
        for(j in 1..i){
            print("*")
        }
        println()
    }
    for(i in 10 downTo 1){
        for(j in 1 .. i){
            print("*")
        }
        println()
    }

}