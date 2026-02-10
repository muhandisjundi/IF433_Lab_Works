package oop_113580_MuhandisJundiRabbani.week02

package oop_113580_MuhandisJundiRabbani.week02

class Student(
    val name: String,
    val nim: String,
    var major: String
){
    init{
        //validasi sederhana: cek panjang nim
        if(nim.length != 5){
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek student $name berhasil dialokasikan di memeory")
        }
    }
}