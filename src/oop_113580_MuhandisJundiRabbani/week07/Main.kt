package oop_113580_MuhandisJundiRabbani.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val clinet = NetworkClient.createClient() //instansiasi lewat factory
    clinet.connect()
}