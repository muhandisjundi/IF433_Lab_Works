package oop_113580_MuhandisJundiRabbani.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("error: Gaji tidak boleh negatif! di set ke 0")
                field = 0 //gunakan field bukan this.salary
            } else {
                field = value
            }
        }

    private var performanceRating: Int = 3

    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    //kita tidak buat getter untuk performanceRating, jadi data ini benar benar rahasia
    //kecuali kita buat function khusus untuk print
    fun printStatus(){
        println("Karyawan: $name, Rating: $salary")
    }

    //tax dihitung 10% dari gaji saat ini
    val tax:Double
        get() = salary * 0.1
}