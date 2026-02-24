package oop_113580_MuhandisJundiRabbani.week04

open class Employee(val name: String, val baseSalary: Int) {
    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        var salary= (baseSalary * 10) /100
        return salary
    }
}