package oop_113580_MuhandisJundiRabbani.week03

class Player(val username: String) {
    private var xp: Int = 0
    var level: Int
        get() = (xp / 100) + 1

    fun addXp(amount: Int) {
        if(amount < 0){
            println("Xp tidak boleh negatif")
            return
        }

        val oldLevel = this.level
        xp += amount
        val newLevel = level

        if(newLevel > oldLevel){
            println("Level up! selamat $username naik ke level $level")
        }

    }
}

