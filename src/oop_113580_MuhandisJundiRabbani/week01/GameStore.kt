package oop_113580_MuhandisJundiRabbani.week01

fun main() {
    val gameTitle = "Pou"
    val price = 200000
    val userNote: String? = null

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(title = gameTitle, finalPrice = finalPrice, note = userNote)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 20) / 100  else (price * 10) / 100

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("Title: $title")
    println("Final Price: $finalPrice")
    println("Note: ${note ?: "Tidak ada catatan"}")
}