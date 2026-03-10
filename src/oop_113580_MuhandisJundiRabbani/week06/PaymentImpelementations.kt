package oop_113580_MuhandisJundiRabbani.week06

class Gopay: PaymentMethod {
    override fun pay(amount: Double) {println("processing Rp$amount via gopay server")}
}

class CreditCard: PaymentMethod {
    override fun pay(amount: Double) {println("contacting bank for Rp$amount")}
}