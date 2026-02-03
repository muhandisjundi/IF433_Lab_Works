package oop_113580_MuhandisJundiRabbani.week01

fun main() {
    //refactor : gunakan val dan hapus tipe data eksplisit
    val name: String = "John Thor"
    val score: Int = 80

    //refactor : string tamplate ($name)
    println("Nama: $name, Nilai: $score")

    //tambahkan dibawah println
    val grade = when (score) {
        in 90 .. 100 -> "A"
        in 80 .. 89 -> "B"
        in 70 .. 79 -> "C"
        else -> "D"
    }

    println("Grade kamu: $grade")

    println("Status: ${calculateStatus(score)}")
}

fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"
