package oop_113580_MuhandisJundiRabbani.week07

import javax.naming.directory.BasicAttribute

fun processEvent(event: BattleState){
    when(event){
        is BattleState.MonsterEncounter -> {
            val (monsterName) = event
            println("Monster muncul: $monsterName")
        }

        is BattleState.LootDropped -> {
            val (item) = event
            println("mendapat loot: ${item.name} (${item.rarity})")
        }

        is BattleState.GameOver -> {
            val (reason) = event
            println("game over: $reason")
        }

        BattleState.SafeZone -> {
            println("Berada di safe zone")
        }
    }
}