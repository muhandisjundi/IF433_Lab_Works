package oop_113580_MuhandisJundiRabbani.week13

import java.io.File
import java.io.FileNotFoundException

data class TradeRecord(
    val id: Int,
    val symbol: String,
    val type: String,
    val margin: Double,
    val pnl: Double
)

fun TradeRecord.toCsv(): String = "$id,$symbol,$type,$margin,$pnl"

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val parts = line.split(",")
        TradeRecord(
            id = parts[0].trim().toInt(),
            symbol = parts[1].trim(),
            type = parts[2].trim(),
            margin = parts[3].trim().toDouble(),
            pnl = parts[4].trim().toDouble()
        )
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try {
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch (e: FileNotFoundException) {
        println("Error: File $path tidak ditemukan!")
        emptyList()
    }
}

fun main() {
    val mockTrades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 50.0, 15.5),
        TradeRecord(2, "ETHUSDT", "Short", 30.0, -5.2),
        TradeRecord(3, "SOLUSDT", "Long", 25.0, 8.7)
    )

    saveTrades(mockTrades, "crypto_trades.csv")

    // Menyuntikkan data kotor/cacat secara sengaja
    File("crypto_trades.csv").appendText("CORRUPT_ID, DOGEUSDT, Hold, XX, YY\n")

    val loadedData = loadTrades("crypto_trades.csv")
    val totalPnl = loadedData.sumOf { it.pnl }

    println("\n=== DAFTAR TRANSAKSI VALID ===")
    loadedData.forEach { println(it) }

    println("\n==== TOTAL PnL BERSIH: $totalPnl ====")
}



