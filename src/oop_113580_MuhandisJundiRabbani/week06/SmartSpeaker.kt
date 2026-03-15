package oop_113580_MuhandisJundiRabbani.week06

class SmartSpeaker (
    override val id: String,
    override val name: String,
) : SmartDevice, Switchable {
    override fun turnOn() {
        println("$name dinyalakan. Lampu nyala")
    }

    override fun turnOff() {
        println("$name dimatikan. Lampu mati")
    }

    fun playMusic(song: String) {
        println("Memutar lagu $song dari Spotify")
    }
}