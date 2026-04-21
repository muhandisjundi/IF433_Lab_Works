package oop_113580_MuhandisJundiRabbani.week09

data class Student(val name: String, val gpa: Double)

fun main() {
    val students = listOf(
        Student("Andi", 3.2),
        Student("Budi", 3.9),
        Student("Citra", 2.8),
        Student("Dewi", 3.7)
    )

    println("=== NOMOR STUDENTS PIPELINE ===")

    //ktia butuh nama mahasiswa yang gpa nya >= 3.5, dan diurutkan abjad
    val honorNames = students
        .filter { it.gpa >= 3.5 }
        .sortedBy { it.name }
        .map { it.name.uppercase() }

    honorNames.forEach { println("honor roll: $it") }
}