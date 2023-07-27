fun biodata(nama:String,umur:Int,nis:Int,alamat:String){
    println("Nama : $nama \n Umur:$umur \n nis: $nis \n alamat:$alamat")
}
fun main(){
    biodata("nama",14,1234,"bogor")
    biodata(nis=1234,nama="Ahmad",umur=15,alamat="Bogor")
    biodata(alamat="Jakarta",nama="Syahdan",nis=32145,umur=14)
}