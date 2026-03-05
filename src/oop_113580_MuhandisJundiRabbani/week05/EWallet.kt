package oop_113580_MuhandisJundiRabbani.week05

class EWallet(var balance: Double) : PaymentMethod("EWallet") {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("Pembayaran Sukses. Balance : $balance")
        } else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
    }
}