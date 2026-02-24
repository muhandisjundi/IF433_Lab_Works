package oop_113580_MuhandisJundiRabbani.week04

//gunakan keyword open agar class bisa diwariskan
open class Vehicle(val brand: String) {
    var speed: Int = 0

    //method jgua bersifat final secaara default. gunakan open agar bisa di override
    open fun accelerate() {
        speed += 10
        println("$brand melaju. kecepatan: $speed km/jam")
    }

    open fun honk() {
        println("beep beep!")
    }
}