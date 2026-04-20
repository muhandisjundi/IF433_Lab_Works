package oop_113580_MuhandisJundiRabbani.week08

fun main(){
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"), // Corrupted warranty
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // Missing ID!
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Unknown type
    )

    val apiParser = ApiParser()

    for (raw in rawApiData){
        try {
            val product = apiParser.parseProduct(raw)

            product?.let{
                apiParser.ceckout(it)
            } ?: println("log: melewati item karena tipe tidak didukung")
        }catch (e: IllegalArgumentException){
            println("peringatan log: data korup terdeteksi. Detail: ${e.message}")
        }
    }

}