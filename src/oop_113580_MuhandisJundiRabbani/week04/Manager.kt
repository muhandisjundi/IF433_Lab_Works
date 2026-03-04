package oop_113580_MuhandisJundiRabbani.week04

class Manager(): Employee {
    override fun work() {
        println("$name sedang memimpin rapat divisi")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500.000
    }
}