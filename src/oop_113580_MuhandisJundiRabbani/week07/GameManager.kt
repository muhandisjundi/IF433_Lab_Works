package oop_113580_MuhandisJundiRabbani.week07

object GameManager{
    var isGameRunning: Boolean = false

    fun startGame() {
        if (!isGameRunning) {
            println("Game sudah berjalan")
        } else{
            println("Memulai game engine...")
            isGameRunning = true
        }
    }
}