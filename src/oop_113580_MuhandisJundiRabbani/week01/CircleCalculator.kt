package oop_113580_MuhandisJundiRabbani.week01

fun main (args: Array<String>) {
    //variable definition
    val radius = 7.0
    val pi = 3.14

    //calculation
    val area: Double = pi * radius * radius

    //output concatenation
    println("Radius: $radius, Area: $area")

    //logic check
    checkSize(area)

    println(checkSize(area))
}

fun checkSize(area: Double) = if (area > 100) "this is a big circle" else "this is a small circle"

