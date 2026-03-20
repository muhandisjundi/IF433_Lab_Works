package oop_113580_MuhandisJundiRabbani.week07

enum class ItemRarity(val dropChance: Int) {
    COMMON(dropChance = 70),
    UNCOMMON(dropChance = 50),
    RARE(dropChance = 10),
    EPIC(dropChance = 5),
    LEGENDARY(dropChance = 2)
}

data class GameItem(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity
)