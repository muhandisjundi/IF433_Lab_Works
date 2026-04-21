package oop_113580_MuhandisJundiRabbani.week09

fun main(){
    var arMhs = listOf("Budi", "susi", "titus")
    println("====== LIST OF ======")

    //view
    println(arMhs)
    //liat panjang array
    println("panjang lsit ${arMhs.size}")
    //ambil satuan data di listOf
    println(arMhs[1])
    //muncul semuanya
    for(a in arMhs){
        println("mahasiswa bernama $a")
    }

    println("====== MUTABLE LIST ======")
    var arAngka = mutableListOf(10, 30, 40, 20, 90, 100, 15)

    //nambah array
    arAngka.add(777)
    //ganti / replacd array
    arAngka[2] = 123
    //hapus array
    arAngka.removeAt(3)
    //view hasil
    println(arAngka)


    println("====== SET OF ======")
    var arUrutan = setOf(20,30,40,20,70,30,10,100)
    println(arUrutan.size)
    println(arUrutan)
    println("ada angka 40 ga?" + arUrutan.contains(40))


    println("====== MUTABLE SET OF ======")
    var arMakanan = mutableSetOf("nasi", "bakpao", "mie", "ayam", "ayam lagi")
    arMakanan.add("ketoprak")
    arMakanan.remove("mie")
    arMakanan.add("mie")
    println(arMakanan)


    println("====== MAP ======")
    var arSiswa = mapOf(
        "andi" to 89,
        "toni" to 73,
        "ivander" to 90
    )
    println("banyak data" + arSiswa.size)
    println("nilai si andi" + arSiswa["andi"])
    println("semua keys: " + arSiswa.keys)
    println("semua values: " + arSiswa.values)
    println("nama siswa index 1: " + arSiswa.keys.elementAt(1))
    println(arSiswa)


    println("====== MUTABLE MAP ======")
    var arMenu = mutableMapOf(
        "nasi" to 1000,
        "ayam" to 2000,
        "sayur asem" to 1500
    )
    println("banyak menu: " + arMenu.size)
    arMenu["nasi"] = 500
    arMenu.remove("ayam")
    arMenu.put("udang", 2300)
    println(arMenu)


    //lambda
    println("====== LAMBDA ======")
    //function biasa
    fun tambah(a:Int, b:Int): Int{
        return a+b
    }
    //function lambda
    var kurang = {a: Int, b: Int -> a-b}

    println("kurang kurangan: ${kurang(5,3)}")

    println("====== IMPICIT IT ======")
    var pangkat = {x:Int -> x*x}
    var hitungPangkat:(Int) -> Int = {it*it}
    println("pangkat " + hitungPangkat(5))


    //tampilin semua hasil pakai looping
    arSiswa.forEach {
        siswa -> println(siswa)
    }
    for(sis in arSiswa){
        println(sis)
    }
}