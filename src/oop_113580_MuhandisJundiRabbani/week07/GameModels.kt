package oop_113580_MuhandisJundiRabbani.week07

enum class ItemRarit(val dropChance: Int) {
    COMMON(dropChance = 70),
    UNCOMMON(dropChance = 50),
    RARE(dropChance = 10),
    EPIC(dropChance = 5),
    LEGENDARY(dropChance = 2)
}