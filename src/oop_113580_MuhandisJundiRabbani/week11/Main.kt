package oop_113580_MuhandisJundiRabbani.week11

fun main() {
    println("=== TEXT EXTENSION FUNCITON ===")
    println("alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty ${text.isNullOrEmptyCustom()}")
}