package oop_113580_MuhandisJundiRabbani.week08

class Alamat(val kota: String?)
class Mahasiswa(val address: Alamat)

fun main() {
    val mhs1 = Mahasiswa(Alamat("Tangerang"))
    val mhs2 = Mahasiswa(Alamat(null))

    println("mahasiswa1 : ${mhs1.address.kota}")
    println("mahasiswa2 : ${mhs2.address.kota}")

    val tetapAlamat = Alamat(null)
    val defaultAlamat = tetapAlamat.kota?.let{
        adrs->"Alamatnyaadalahhhhhhhh $adrs"
    } ?: "Alamat kamu kosong"
    println("Alamat kamu ${tetapAlamat.kota}")
}