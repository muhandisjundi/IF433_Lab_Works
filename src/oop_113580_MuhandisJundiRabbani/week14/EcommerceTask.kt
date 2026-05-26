package oop_113580_MuhandisJundiRabbani.week14

import java.io.File

class BadOrderProcessor {
    // VIOLATION: Hardcoded File I/O (DIP)
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        // VIOLATION: Kaku jika ada tipe customer/diskon baru di masa depan (OCP)
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90 // Diskon 10%
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        // VIOLATION SRP/DIP: Menulis file langsung di class bisnis
        file.appendText("$itemName, $finalPrice, $customerType\n")

        // VIOLATION SRP/DIP: Notifikasi terikat kuat dengan sistem order
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository : OrderRepository {
    private val file = File("orders.csv")
    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        // Menggunakan safe resource handling 'use' untuk stream penulisan
        file.printWriter().use { }
        file.appendText("$itemName, $finalPrice, $customerType\n")
    }
}

interface NotificationService {
    fun sendNotification(itemName: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}