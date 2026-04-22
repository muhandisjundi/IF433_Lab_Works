package oop_113580_MuhandisJundiRabbani.week09

fun main(){
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "long", 10, 15.2, "OPEN"),
        TradeLog("ETHUSDT", "short", 5, -8.5, "CLOSED"),
        TradeLog("BTCUSDT", "short", 20, 25.0, "CLOSED"),
        TradeLog("ETHUSDT", "long", 10, -12.3, "OPEN"),
        TradeLog("BNBUSDT", "long", 8, 5.7, "CLOSED"),
        TradeLog("BTCUSDT", "long", 15, -3.2, "OPEN")
    )

    val closedTrades = tradeHistory.filter{ it.status == "CLOSED" }

    val winningTrades = closedTrades.filter{ it.roe > 0 }

    val losingTrades = closedTrades.filter{ it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map{
            "WIN [${it.pair} - ${it.position}]: + ${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    val uniquePairs = tradeHistory
        .map{ it.pair } //manggil pair nya aja
        .toSet() //untuk ilangin duplikat


    println("\N=== CRYPTO TRADING DASHBOARD ===")

    topPerformersString.forEach{
        println(it)
    }
}