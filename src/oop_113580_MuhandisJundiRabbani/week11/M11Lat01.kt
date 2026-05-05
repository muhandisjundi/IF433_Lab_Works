package oop_113580_MuhandisJundiRabbani.week11

fun String.DasarExtension():String{
    return "halo wok $this"
}

//extension function dasar
fun String.RubahHurufBesarDepan(): String {
    var hasil = ""
    hasil = this.split(" ").joinToString(" ") {
        it.replaceFirstChar {
            c -> c.uppercase ()} }
    return hasil
}


//extension function pake parameter
fun String.tentukanKelulusan(nilai:Int):String{
    var hasil = ""
    if(nilai>70){
        hasil = "lulus"
    } else {
        hasil = "remed"
    }
    return this + " " + hasil
}

fun String?.CekNulldanEmpty(): String{
    var hasil = ""
    if(this == null || this.isEmpty()) {
        hasil = "GABOLEH NULL KOSONG!!!!!!!!!!!!!!!!!!!!"
    } else {
        hasil = "password kamu: $this"
    }
    return hasil
}

//untuk scope - apply
data class Manusia(var nama: String, var umur: Int)



fun main() {
    //extension fuction - cek null atau empty
    var passwordKamu:String? = "12345"
    println(passwordKamu.CekNulldanEmpty())

    //call extension function + parameter
    println("kelulusan kamu".tentukanKelulusan(71))

    //penerapan basic funvtion
    println("WIarawan".DasarExtension())

    //tanpa extension function
    val nama1 = "budi sihombing"
    println(nama1.uppercase())

    //dengan extension function
    println("budi udin sdbsjd sdjs fksjdfs fdskks".RubahHurufBesarDepan())


    //scope - let
    var huruf: String = "UMN"
    huruf.let {
        if(it=="UMN"){
            println("kampus saya")
        } else {
            println("BUKAN KAMPUS SAYAAA!!!!!!!!!!!!!!!!!!!")
        }
    }

    //scope - run
    var nilaiKamu = 70.run {
        if(this >= 70){
            println("lulus")
        } else {
            println("gagal")
        }

    }

    //scope - with
    val pekerjaan = with("Mahasiswa"){
        if(this=="Mahasiswa"){
            println("pelajar")
        } else {
            println("pekerja")
        }
    }

    //scope - apply
    val orang = Manusia("budi", 25).apply{
        umur = 27
    }
    println("nama kamu ${orang.nama} umur kamu ${orang.umur}")

    //scope - also
    var deretAngka = mutableListOf<Int>(1,2,3,4)
    deretAngka.also {
        println("sebelum $deretAngka")
    }.add(5)
    println("setelah $deretAngka")

}