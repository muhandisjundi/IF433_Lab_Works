package oop_113580_MuhandisJundiRabbani.week06

interface SmartDevice {
    val id: String
    val name: String
}

interface Switchable {
    abstract fun turnOn()
    abstract fun turnOff()
}

interface Recordable {
    fun startRecord()
    fun stopRecord() {
        println("Perekaman dihentikan dan disimpan ke Cloud")
    }
}