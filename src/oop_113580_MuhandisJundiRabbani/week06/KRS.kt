package oop_113580_MuhandisJundiRabbani.week06

class KRS(override val nama: String, override val namaSiswa: String) : Mahasiswa, Siswa {
    override fun belajar() {
        println("si $nama sedang belajar")
        println("si $namaSiswa sedang belajar juga")
    }

    override fun serang() {
        println("si $nama serang")
    }

    override fun makan() {
        println("si $nama makan")
    }

    override fun mandi() {
        println("si $nama mandi")
    }

    override fun main_game() {
        super<Mahasiswa>.main_game()
    }



}