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

    println("\n--- Testing Electric car ---")
    val elc = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 100)
    elc.accelerate()
    elc.honk()
    elc.openTrunk()

    println("\n--- Employee Manager Case ---")
    val manager = Manager("John Thor", baseSalary = 5000_000)
    val developer = Developer("Adam Kevin", baseSalary = 1000, "Kotlin")

    manager.work()
    println(manager.calculateBonus())

    developer.work()
    println(manager.calculateBonus())
}