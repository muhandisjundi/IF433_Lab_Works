package oop_113580_MuhandisJundiRabbani.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "sepeda onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk() //memanggil method milik sendiri
    myCar.honk()      //memanggil method yang sudah di override
    myCar.accelerate() //memanggil gabungan method parent dan child
}