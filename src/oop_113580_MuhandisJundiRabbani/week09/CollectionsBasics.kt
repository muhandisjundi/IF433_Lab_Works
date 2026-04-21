package oop_113580_MuhandisJundiRabbani.week09

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
}