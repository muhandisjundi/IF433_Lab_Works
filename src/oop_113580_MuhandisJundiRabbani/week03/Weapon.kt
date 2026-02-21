package oop_113580_MuhandisJundiRabbani.week03

class Weapon(val name: String) {
    var damage: Int = 0
        set(value) {
            if(damage < 0){
                println("Damage gaboleh 0")
                return
            }
            field = if(value > 1000) 1000 else value
        }

    val tier: String
        get(){
            if(damage > 800){
                println("Legendary")
            } else if(damage > 500){
                println("Epic")
            } else{
                println("Common")
            }
        }

}