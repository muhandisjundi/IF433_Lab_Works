package oop_113580_MuhandisJundiRabbani.week02

class Student(
    val name: String,
    val nim: String,
    var gpa: Double = 0.0,
    var major: String
){
    init{
        //validasi sederhana: cek panjang nim
        if(nim.length != 5){
            println("WARNING: Objek tercipta dengan nim ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalaha di sistem.")
        } else {
            println("LOG: objek student $name berhasil dialokasikan di memory.")
        }
    }

    constructor(name: String, nim: String): this(name, nim, major = "Non_Matriculated"){
        println("LOG: menggunakan constructor jalur umum (tanpa jurusan).")
    }
}