package oop_113580_MuhandisJundiRabbani.week09

fun main(){
    val numbers = listOf(1,2,3,4,5,6,7,8)
    println("original data: $numbers")
    println("\n=== HOF: FILTER ===")
    //filter() membuar list baru berisi elemen yang memenuhi kondisi true
    val evens = numbers.filter { it % 2 == 0 }
    println("evens only: $evens")
}