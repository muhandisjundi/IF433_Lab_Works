package oop_113580_MuhandisJundiRabbani.week04

class Knd_motor: Kendaraan() {
    private var jmlBan:Int = 0
    init{
        jmlBan = 2
        println("Motor punya $jmlBan ban")
        this.jalan_maju()
    }

    //tambahin final kalo gamau punya anak lagi anaknya
    final override fun jalan_maju() {
        println("majuuuuuuuuuuuuuuuuuu mobil")
    }
}