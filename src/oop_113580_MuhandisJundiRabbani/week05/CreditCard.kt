package oop_113580_MuhandisJundiRabbani.week05

import jdk.jfr.DataAmount

class CreditCard(val limit: Double, var usedAmount: Double = 0.0) : PaymentMethod("EWallet") {
    override fun processPayment(amount: Double) {
        if (usedAmount + amount < limit) {
            usedAmount += amount
            println("Penambahan credit berhasil")
        } else if (usedAmount > limit) {
            println("Transaksi Tertolak")
        }
    }

}