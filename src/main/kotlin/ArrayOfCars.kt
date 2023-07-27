fun main(){
//   membuat array
    var cars = arrayOf("Avanza","Toyota","Mitsubishi")
//   array punya element  = 3
//         punya index    = 0,1,2
    // cars[1]

    println("Index Ke 1: ${cars[1]}")
//    ubah isi data index-1 jadi Ferari
    cars[1] = "Ferari"
    println("Setelah diubah menjadi: ${cars[1]}")

// cetak total data array
    var sizeCars:Int = cars.size
    println("Total Data: ${sizeCars}")

// cek apakah data yang kita mau ada di dalam array
    if("Mitsubishi" in cars)
        println("ada")
     else
        println("tidak ada")


//    for (c in cars){
//        println(c)
//    }
}