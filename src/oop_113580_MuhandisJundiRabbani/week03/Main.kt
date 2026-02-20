package oop_113580_MuhandisJundiRabbani.week03

fun main() {
    val e = Employee("Budi")
    println("--- Text Error ---")
    e.salary = 5000 //ini akan meledakkan program anda
}