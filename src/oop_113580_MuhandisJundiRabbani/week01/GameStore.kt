package oop_113580_MuhandisJundiRabbani.week01

fun main() {
    val gameTitle = "Pou"
    val price = 200000

    printReceipt(title = gameTitle, finalPrice = price)
}

fun calculateDiscount(price: Int): Int = if (price > 500000) (price * 20) / 100  else (price * 10) / 100

fun printReceipt(title: String, finalPrice: Int) {}