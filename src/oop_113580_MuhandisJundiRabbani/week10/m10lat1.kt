package oop_113580_MuhandisJundiRabbani.week10

//non generic programming
class nonGeneric(var hasil: Any)


//generic proggramming
class generic<T>(var hasil:T)

//generic programming - 2 parameter
class Kota<T, V>(var kodepos:T, var telp:V)

//generic programming - function
fun<T> cobaFungsi(angka:T):T {
    return angka
}

//generic programming - type constraint
fun<T: Number> tambah(angka:T): Double{
    return angka.toDouble() + 50
}

fun<T: Number> kurang(angka:T):Int{
    return angka.toInt() - 50
}

//generic programming - function in class
class kalkulator<T: Number>(val a:T, val b:T){
    fun kali(): Double {
        return a.toDouble() * b.toDouble()
    }
    fun bagi():Int {
        return b.toInt() / b.toInt()

    }
}

//generic programming - WHERE
fun<T> nilaiKKM(list: List<T>, kkm:T):List<T> where T: Comparable<T> {
    return list.filter { it >= kkm }
}


fun main(){
    println("===== Generic - WHERE =====")
    val nilaiMhs = listOf(80,90,83,70,65,50,83,40,61)
    val nilaiFilterKKM = nilaiKKM(nilaiMhs, 70)
    println(nilaiMhs)
    println(nilaiFilterKKM)


    println("===== Generic - Function in class =====")
    val kal = kalkulator(10.2, 3.5)
    println("hasil kali: ${kal.kali()}")
    println("hasil kali: ${kal.bagi()}")



    println("===== Generic - Constraint =====")
    println("hasil tambah " +tambah(100.5))
    println("hasil kurang " +kurang(100.5))


    //pengaplikasian non generic programming
    println("===== NonGeneric =====")
    val nGen = nonGeneric(100)
    val angkaNGen = nGen.hasil as Int
    println(angkaNGen + 50)

    //pengaplikasian generic programming
    println("===== Generic =====")
    val gen = generic(200)
    println(gen.hasil + 50)

    println("===== Generic 2 Parameter =====")
    val city = Kota("12345", 2121212)
    println("Kodepos kamu " + city.kodepos)
    println("telp kamu " + city.telp)

    println("===== Generic - function =====")
    println("hasil " + cobaFungsi(10))
}