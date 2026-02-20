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
}