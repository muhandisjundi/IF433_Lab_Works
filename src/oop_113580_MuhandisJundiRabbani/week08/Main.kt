package oop_113580_MuhandisJundiRabbani.week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    //rantai safe calls yang elegan
    val destination = emptyOrder.deliverDetails?.address?.city?.name?: "Kota tidak diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let { price ->
        //blook ini hanya jalan jika totalprice tidak null
        val tax = price * 0.11
        "Transaksi valid. harga: Rp$price, pajak: Rp$tax"
    } ?: "Transaksi invalid: harga belum di set!"

    println(receipt)
}