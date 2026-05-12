package oop_113580_MuhandisJundiRabbani.week12


fun pembagian() {
    try {
        val a = 10
        val b = 0
        val hasil = a/b
        println("hasil bagi: $hasil")
    } catch (e: Exception) {
        println("ada error " + e.message)
    } finally {
        println("selesai try catch")
    }
}

fun cek_tipe_variabel() {
    var angka:Int = try {
        Integer.parseInt("123")
    } catch (e:Exception){
        println("ada error ${e.message}")
        1
    }
    println(angka)
}

fun cek_nilai(nilai:Int) {
    if(nilai>100){
        throw IllegalArgumentException("masa nilai lebih dari 100, kan kamu ngerjain nya ngasal masa bener semua. tidak ada yang sempurna di dunia ini")
    } else {
        println("nilai kamu adalah " + nilai)
    }
}

class cek_saldo_rekening(val pengeluaran:Int, val saldo: Int): Exception("saldo kamu sisa $saldo, gak cukup buat belanja $pengeluaran")

class transaksi_keuangan(val totalBelanja:Int) {
    fun narik_uang(balance: Int) {
        if(totalBelanja > balance){
            try {
                throw cek_saldo_rekening(totalBelanja, balance)
            } catch (e: Exception) {
                println(e.message)
            }
        } else {
            println("transaksi berhasil, sisa saldo ${balance - totalBelanja}")
        }
    }
}

fun multiple_catch(input: String) {
    try {
        val angka:Int = input.toInt()
        val hitungBagi:Int = angka/0
        println("hasil bagi $hitungBagi")
    } catch (e: NumberFormatException) {
        println("gabisa membagi bilangan huruf ${e.message}")
    } catch (e: ArithmeticException) {
        println("masa pembagian pake 0 : ${e.message}")
    } catch (e: Exception) {
        println("ada error di multiple catch ${e.message}")
    }
}

sealed class BANKException(pesan: String): Exception("error di BANK exception $pesan")

class cek_saldo(val pengeluaran: Int): BANKException("belanja $pengeluaran lebih besar dari saldi")
class cek_input(val transaksi:Int): BANKException("transaksi masa minus")

fun transaksi_belanja(saldoKamu:Int, jajanKamu:Int): Int {

    if(jajanKamu<0) {
        throw cek_input(jajanKamu)
    } else if(saldoKamu<jajanKamu) {
        throw cek_saldo(jajanKamu)
    }
    return saldoKamu - jajanKamu

}

fun main(){
    runCatching { transaksi_belanja(1000, 800) }
        .onSuccess { println("belanja berhasil, sisa saldo $it")}
        .onFailure { println(it) }

    multiple_catch("abc")

    pembagian()
    cek_tipe_variabel()
    try {
        cek_nilai(1000)
    } catch(e:Exception){
        println("ada erorr di nilai: "+ e.message)
    }
    val trx = transaksi_keuangan(1000)
    trx.narik_uang(1200)


}