package oop_113580_MuhandisJundiRabbani.week04

class Knd_mobil: Kendaraan() {
    private var jmlBan:Int = 4
    init{
        jmlBan = 4
        println("Mobil punya $jmlBan ban")
    }

    override fun jalan_maju() {
        println("majuuuuuuuuuuuuuuuuuu motor")
    }
}