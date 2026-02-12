package oop_113580_MuhandisJundiRabbani.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("---Aplikasi peminjaman buku umn---")

    println("Masukkan Judul Buku: ")
    val judul = scanner.nextLine()

    println("Masukkan Nama Peminjam: ")
    val peminjam = scanner.nextLine()

    println("Masukkan Lama Peminjaman (dalam hari): ")
    var lamaPinjam = scanner.nextInt()

    scanner.nextLine()

    if(lamaPinjam < 0){
        lamaPinjam = 1
    }

    val loan = Loan(judul, peminjam, lamaPinjam)
    println("Peminjaman Berhasil.")

    println("=== Detail Peminjaman ===")
    println("Judul Buku: ${loan.bookTitle}")
    println("Nama Peminjam: ${loan.borrower}")
    println("Durasi Pinjam: ${loan.loanDuration}")
    println("Rp. Total Denda: ${loan.calculateFine()}")
}