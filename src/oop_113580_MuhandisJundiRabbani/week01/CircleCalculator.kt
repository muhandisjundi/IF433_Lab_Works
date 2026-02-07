package oop_113580_MuhandisJundiRabbani.week01

fun main () {

    val radius = 7.0
    val pi = 3.14

    val area: Double = pi * radius * radius

    println("Radius: $radius, Area: $area")
    checkSize(area)
    println(checkSize(area))
}

fun checkSize(area: Double) = if (area > 100) "this is a big circle" else "this is a small circle"

