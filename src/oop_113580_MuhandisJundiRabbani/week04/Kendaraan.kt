package oop_113580_MuhandisJundiRabbani.week04

open class Kendaraan {
    private var merk: String = ""
    private var kecepatan: Int = 0

    //final kalo ga open
    open fun jalan_maju() {
        println("Jalannnn... $kecepatan !!!")
    }

}