package oop_113580_MuhandisJundiRabbani.week06

class Button(override val name: String) : Clickable {
    override fun click() {
        println("tombol '$name' berhasil diklik")
    }
}