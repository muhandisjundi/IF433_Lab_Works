package oop_113580_MuhandisJundiRabbani.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alek", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    //polymorphic collection: list yang berisi tipe parent, tapi isinya objek anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        //pemanggilan runtime polymorphism
        pegawai.bekerja()

        //pegawai.mengajar() ini eror karena manggil nya pegawai bukan dosen

        //smart casting dengan is dan when
        when (pegawai) {
            is Dosen ->  {
                println("=> Terdeteksi sebagai dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar() //smart cast, tidak perlu manual casting (as)
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }

        println("------------------------------------")
    }

    println("==========================")

    val mathHelper = MathHelper()

    val luasPersegi = mathHelper.hitungLuas(5)
    val luasPersegiPanjang = mathHelper.hitungLuas(3, 2)
    val lingkaran = mathHelper.hitungLuas(5.2)

    println("Luas persegi = $luasPersegi")
    println("Luas persegi panjang = $luasPersegiPanjang")
    println("Luas lingkaran= $lingkaran")

    println("====================================")

    val eWallet = EWallet(50000.0)
    val creditCard = CreditCard(100000.0)

    val paymentMethod: List<PaymentMethod> = listOf(eWallet, creditCard)

    for (payment in paymentMethod) {
        payment.processPayment(750000.0)
    }


}