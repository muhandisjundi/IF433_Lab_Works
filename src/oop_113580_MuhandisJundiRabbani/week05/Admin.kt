package oop_113580_MuhandisJundiRabbani.week05

class Admin(nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang duduk di depan komputer melayani administrasi")
    }

    //fungsi unik/spesifik yang hanya dimiliki admin
    fun doAdminWork() {
        println("[$nama] sedang merekap data absensi mahasiswa")
    }
}