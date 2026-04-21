package oop_113580_MuhandisJundiRabbani.week09

fun main(){
    println("=== TEST LAMBDA ===")
    //syntax lambda explisit: {parameters -> body}
    val sumLambda = {a: Int, b: Int -> a+b}
    println("hasil sum: ${sumLambda(5, 10)}")

    //lambda dengna satu parameter bisa menggunakan impisit 'it'
    val squareImpicit: (Int) -> Int = {it*it}
    println("hasil square: ${squareImpicit(4)}")
}