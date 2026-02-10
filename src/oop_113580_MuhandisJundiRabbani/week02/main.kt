package oop_113580_MuhandisJundiRabbani.week02

import java.util.Scanner




fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PMB UMN ---")

    print("Masukkan Nama: ")
    val name = scanner.nextLine()

    print("Masukkan NIM (wajib 5 karakter): ")
    val nim = scanner.next()

    scanner.nextLine() //bersihkan buffer newline (penyakit klasik scanner!)

    //validasi di sisi pemanggil (main)
    if (nim.length != 5) {
        println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
        //program berhenti di sini untuk mahasiswa ini, tidak membuat objek
    } else {
        print("Masukkan jurusan: ")
        val major = scanner.nextLine()

        //instansiasi objek karena data sudah aman
        val s1 = Student(name, nim, major)
        println("Status: pendaftaran selesai.")
    }
}