package oop_113580_MuhandisJundiRabbani.week08

fun main() {
        var nama: String? = "wirawan"

    try {
        println("hai $nama")
        println("panjang hururf ${nama!!.length}")
    } catch (e: NullPointerException){
        println("ada error exception, ini oesan errornya ${e.message}")

    }

    val mixedData:List<Any?> = listOf(1, "Budi", 10, "online", null)
    for(item in mixedData){
        val hasil = item as? String
        if(hasil != null){
            println(hasil)
        }
    }


}
