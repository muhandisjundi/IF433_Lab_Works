package oop_113580_MuhandisJundiRabbani.week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    //rantai safe calls yang elegan
    val destination = emptyOrder.deliverDetails?.address?.city?.name?: "Kota tidak diketahui"
    println("Tujuan pengiriman: $destination")
}