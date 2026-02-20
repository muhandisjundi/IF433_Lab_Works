package oop_113580_MuhandisJundiRabbani.week03

open class Karyawan {
    //disarankan semua var tipe nya private supaya ga gampang di ganti
    private var nama: String = "belom ada"
    private var gaji: Int = 0
    protected var namaPacar: String = "jomblo"

    var umur: Int = 0
        set(value) {
            if (value < 0) field = value

        }
        get() {
            return field
        }



    //if gabisa di variabel makanya pake nya di method

    public fun set_nama(namakamu:String) {
        if(namakamu.length == 0){
            println("eh nama ga boleh kosong bang")
        } else{
            this.nama = namakamu
        }
    }

    public fun get_nama():String {
        return this.nama + " ok"
    }

    public fun set_gaji(gajimu:Int){
        if(gajimu < 0){
            println("kok mines bang gaji nya")
        } else{
            this.gaji = gajimu
        }
    }

    public fun get_gaji():Int {
        return this.gaji
    }
}

//panggil anak paling bawah supaya bisa akses semua yg ada di ortu" nya
class DataPribadi:Karyawan() {

    public fun ambil_data_pacar(): String {
        return this.namaPacar

    }
}

fun main() {
    var dp = DataPribadi()
    println("nama pacar: " + dp.ambil_data_pacar())
    println("nama karyawan: " + dp.get_nama())

    dp.umur = 10
    println("umur kamu " + dp.umur)
}


//fun main() {
//    var kry = Karyawan()
//    kry.set_nama("ucok sitorus")
//
//    kry.set_gaji(-100)
//    println("hai " + kry.get_nama())
//    println("gajinya cuma " + kry.get_gaji())
//
//
//}