package oop_113580_MuhandisJundiRabbani.week07

class Hitungan private constructor(val tipe: String) {
    fun show_data() {
        println("isi param class: ${tipe}")
    }

    companion object {
        const val namaMtk: String = "Matematika"

        fun tambah(a:Int, b:Int) {
            println("hasil penambahan " + (a + b))
        }

        fun kali(a:Int, b:Int) {
            print("hasil kali " + (a * b))

        }

        fun buat_data(tipeUser: String): Hitungan {
            return Hitungan(tipeUser)
        }


    }
}