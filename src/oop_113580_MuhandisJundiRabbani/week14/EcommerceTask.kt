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

interface PricingStrategy {
    fun calculate(price: Double): Double
    fun getCustomerType(): String
}

class RegularPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price
    override fun getCustomerType(): String = "REGULAR"
}

class VipPricing : PricingStrategy {
    override fun calculate(price: Double): Double = price * 0.90
    override fun getCustomerType(): String = "VIP"
}

// Class Utama yang Bersih dan Sepenuhnya Mematuhi SOLID
class FinalSafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, pricingStrategy: PricingStrategy) {
        val finalPrice = pricingStrategy.calculate(basePrice)
        val customerType = pricingStrategy.getCustomerType()

        println("Memproses pesanan $itemName seharga $finalPrice")

        // Operasi pemulihan infrastruktur lewat abstraksi interface
        repo.saveOrder(itemName, finalPrice, customerType)
        notifier.sendNotification(itemName)
    }
}

fun main() {
    val repo: OrderRepository = CsvOrderRepository()
    val notifier: NotificationService = EmailNotifier()
    val orderProcessor = FinalSafeOrderProcessor(repo, notifier)

    println("=== TESTING SOLID ORDER PROCESSOR ===")
    orderProcessor.processOrder("Laptop Gaming", 15000000.0, RegularPricing())
    orderProcessor.processOrder("Smartphone Flagship", 10000000.0, VipPricing())
}