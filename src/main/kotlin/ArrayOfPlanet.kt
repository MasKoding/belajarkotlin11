fun main() {
    var planet = arrayOf(
        "Merkurius",
        "Venus",
        "Bumi",
        "Mars",
        "Jupyter",
        "Saturnus",
        "Uranus",
        "Neptunus"
    )
//    cetak Mars dan Uranus
    println("Planet ${planet[3]} dan ${planet[7]}")
//    cetak total planet
    println("Total: ${planet.size}")
//    cek apakah pluto ada di dalam planet
    if("Pluto" !in planet){
        println("Pluto Tidak Ada")
    }
//    looping semua data planet dalam
    println("Planet dalam")
    for (p in 0 until 4) {
        println(planet[p])
    }
//    looping semua data planet luar
    println("Planet luar")
    for (p in 4 until 8) {
        println(planet[p])
    }
}
