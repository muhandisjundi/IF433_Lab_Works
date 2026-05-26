package oop_113580_MuhandisJundiRabbani.week13

import java.io.File

fun main () {
    println("=== TEST WRITE TEXT ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Inisialisasi sistem. \n")
    println("file berhasil dibuat dan ditulis")


}