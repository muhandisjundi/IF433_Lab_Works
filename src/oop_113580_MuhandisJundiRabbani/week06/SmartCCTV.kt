package oop_113580_MuhandisJundiRabbani.week06

class SmartCCTV (
    override val id: String,
    override val name: String,
) : SmartDevice, Switchable, Recordable  {
    override fun turnOn() {
        println("$name dinyalakan. Lampu nyala")
        startRecord()
    }

    override fun turnOff() {
        println("$name dimatikan. Lampu mati")
    }

    override fun startRecord() {
        println("Mulai Merekam")
    }
}