package oop_113580_MuhandisJundiRabbani.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}