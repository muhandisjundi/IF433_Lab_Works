package oop_113580_MuhandisJundiRabbani.week01

fun main (args: Array<String>) {
    //variable definition
    var radius: Double = 7.0
    var pi: Double = 3.14

    //calculation
    var area: Double = pi * radius * radius

    //output concatenation
    println("Radius: " + radius + ", Area: " + area)

    //logic check
    checkSize(area)
}

fun checkSize(area: Double) {
    if (area > 100) {
        println("this is a big circle")
    } else {
        println("this is a small circle")
    }
}