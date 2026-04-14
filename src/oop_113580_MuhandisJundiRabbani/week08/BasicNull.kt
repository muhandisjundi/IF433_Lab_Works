package oop_113580_MuhandisJundiRabbani.week08


class profile_page(val idprofile: String, val statusOnline: String?){

    fun ganti_foto(filePhoto: String?) {
        println("foto kamu ${filePhoto}")
    }
}

fun main() {
    var nama: String? = "Wiarawan"
    nama = null
    println("nama kamu $nama")

    val profile = profile_page("12345", null)
    println("id ${profile.idprofile} statusnya: ${profile.statusOnline}")

    profile.ganti_foto(null)
}