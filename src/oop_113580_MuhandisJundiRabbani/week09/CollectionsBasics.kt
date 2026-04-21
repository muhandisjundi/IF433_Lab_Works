package oop_113580_MuhandisJundiRabbani.week09

import oop_113580_MuhandisJundiRabbani.week01.printReceipt

fun main(){
    println("=== TEST LIST ===")
    //immuttable list: tidak bisa diubah setelah dibuat
    val framewroks: List<String> = listOf("Kotlin", "Java", "C++")
    //frameworks.add("python") //uncomment ini akan error
    println("immutable list: $framewroks")

    //mutable list: bisa ditambah/dikurangi
    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("mutable list: $scores")


    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf(1,2,2,3,3,4)
    println("uniqueNumbers (set): $uniqueNumbers") //duplikat hilang

    val activeUsers = mutableSetOf("userA", "userB")
    activeUsers.add("userC")
    activeUsers.add("userA") //diabaikan karena sudah ada
    println("active users: $activeUsers")


    println("\n=== TEST MAP ===")
    val studentGrades = mapOf(
        "Alice" to "A",
        "Bob" to "B",
        "Charlie" to "A" //value boleh duplikat, key tidak
    )
    println("nilai bob: ${studentGrades["Bob"]}")

    val inventory = mutableMapOf("Apples" to 50, "Bananas" to 30)
    inventory["Oranges"] = 20 //menambah data baru
    inventory["Apples"] = 45 //mengupdate data lama
    println("inventory: $inventory")
}