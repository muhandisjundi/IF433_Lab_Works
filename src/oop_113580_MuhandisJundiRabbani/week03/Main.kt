package oop_113580_MuhandisJundiRabbani.week03

fun main() {
    val e = Employee("Budi")

    //1 test validasi salary
    e.salary = -1000
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    //2 test encapsulation
    e.increasePerformance()
    //e.perfromanceRating = 5 // coba uncomment pasti eror

    //3 test computed property
    println("Pajak yang harus dibayar: ${e.tax}")
}