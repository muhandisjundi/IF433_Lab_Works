package oop_113580_MuhandisJundiRabbani.week04

open class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : Car(brand, numberOfDoors) {
    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. kapasitas baterai: $batteryCapacity%.")
    }

}