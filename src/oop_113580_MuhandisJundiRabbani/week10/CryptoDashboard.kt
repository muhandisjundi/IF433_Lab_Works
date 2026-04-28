package oop_113580_MuhandisJundiRabbani.week10



fun main() {
    val coinRepo = WalletRepository<Coin>()
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.0))
    coinRepo.add(Coin("USDT", 1000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")
    println("--- Coin List ---")
    response.data.forEach { coin ->
        println("Coin: ${coin.name}, Balance: ${coin.balance}")
    }


    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 0.01))
    txRepo.add(Transaction("TX002", 150.0))

    println("\n--- Transaction Logs ---")
    txRepo.getAll().forEach { tx ->
        println("ID: ${tx.id}, Amount: ${tx.amount}")
    }
}

}