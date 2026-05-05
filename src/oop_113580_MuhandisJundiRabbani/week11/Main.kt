package oop_113580_MuhandisJundiRabbani.week11

fun main() {
    println("=== TEXT EXTENSION FUNCITON ===")
    println("alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty ${text.isNullOrEmptyCustom()}")


    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run {
        println("Memproses kata: ${this}")
        length * 2
    }
    println("Hasil kalkulasi run: $result")



    println("=== TEST APPLY ===")
    val user = User().apply {
        name = "Alex"
        age = 25
    }
    println(user)
}