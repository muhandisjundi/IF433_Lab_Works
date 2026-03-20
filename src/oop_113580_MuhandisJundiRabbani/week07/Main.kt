package oop_113580_MuhandisJundiRabbani.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val clinet = NetworkClient.createClient() //instansiasi lewat factory
    clinet.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}")

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1) //otomatis readable format
    println("Sama? ${data1 == data2}") //true (structural equality)

    val data3 = data1.copy()
    println("Hasil copy: $data3")

    val (userName, userAge) = data1 //destructing declaration
    println("Destructured: $userName berumur $userAge")

    val response : ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    //error: when expression must be exhaustive
    val uiMessage = when(response) {
        is ApiResponse.Success -> "Tampikan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan spinner"
    }

    GameManager.startGame()
    GameManager.startGame()

    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}")
    val weapon = Weapon.forgeStarterSword()
    println("Starter weapon => ${weapon.item.name} \n DMG: ${weapon.item.damage} \n ${weapon.item.rarity} \n Durability: ${weapon.durability}")


    val starterWeapon = Weapon.forgeStarterSword()
    println("Pemain mampir ke blacksmith buaat upgrade senjata...")

    val upgradeItem = starterWeapon.item.copy(damage = 25)
    println("Damage naik jadi ${upgradeItem.damage}")

    println("\n==== SIMULASI ===")
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradeItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))

}
