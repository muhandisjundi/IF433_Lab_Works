package oop_113580_MuhandisJundiRabbani.week06

class SmartLamp (
    override val id: String,
    override val name: String,
) : SmartDevice, Switchable {
    override fun turnOn() {
        println("$name dinyalakan. Lampu nyala")
    }

    override fun turnOff() {
        println("$name dimatikan. Lampu mati")
    }
}