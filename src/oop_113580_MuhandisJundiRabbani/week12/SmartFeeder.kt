package oop_113580_MuhandisJundiRabbani.week12

fun dispenseKibble(requestedGram: Int, availableGram: Int, isJammed: Boolean): Int {
    require(requestedGram > 0) { "Porsi kibble harus lebih dari 0 gr" }

    if (isJammed) {
        throw DispenserJamException()
    }

    if (requestedGram > availableGram) {
        throw FoodEmptyException(requestedGram, availableGram)
    }

    println("Kibble berhasil dikeluarkan!")
    return availableGram - requestedGram
}


fun main() {
    var currentKibbleStock = 50

    println("--- Simulasi Jadwal Makan Pagi ---")
    try {
        currentKibbleStock = dispenseKibble(80, currentKibbleStock, false)
    } catch (e: DispenserJamException) {
        println("Error Hardware: ${e.message}")
    } catch (e: FoodEmptyException) {
        println("Error Stok: ${e.message}")
    } catch (e: Exception) {
        println("Error Umum: ${e.message}")
    } finally {
        println("Siklus pengecekan dispenser pagi selesai.")
    }

    println("\n--- Simulasi Jadwal Makan Sore ---")
    val result = runCatching {
        dispenseKibble(30, 1000, false)
    }

}

