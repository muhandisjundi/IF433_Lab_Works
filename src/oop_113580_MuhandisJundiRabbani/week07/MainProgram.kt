package oop_113580_MuhandisJundiRabbani.week07

import oop_113580_MuhandisJundiRabbani.week07.Hitungan.Companion.namaMtk

fun main(){
    Koneksi.kon = "localhost:123"
    println("link ${Koneksi.kon}")
    Koneksi.coba_konek_db()

    Hitungan.tambah(10, 20)
    Hitungan.kali(10, 20)
    println("Nama matkul: ${Hitungan.namaMtk}")

    Hitungan.buat_data("user biasa")

    val hit = Hitungan.buat_data("Admin")
    hit.show_data()

    val dt = SaveData("Mario",10, 100, 5)
    println("Nama char ${dt.namaChar}")

    val dtCopy = dt.copy("Luigi")
    println("Nama char ${dtCopy.namaChar}")
    println(dtCopy)

    println("=== class ENUM ===")
    val arh = Arah.Atas
    println(arh.tampilkan_isi_param())

    println("--- SEALED Class ---")

    val hsl: Hasil = Hasil.sukses("Berhasil simpan")
    hsl.handle_response(hsl)

}
