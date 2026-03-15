package oop_113580_MuhandisJundiRabbani.week06

//menggabungkan 1 parent class dan 2 interfaces
class Smartwatch : Watch(), BluethoothConnectable, Recahrgable {
    override fun showTime() {
        println("layar oled menyala: 14:00 WIB")
    }

    override fun connectToBluethooth() {
        println("mencari perangkat HP di sekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("mengisi daya menggunakan charger magnetik 15W")
    }
}