package oop_113580_MuhandisJundiRabbani.week14

class proses_khs {
    fun hitung_nilai_tugas(quiz: Double, aktivitas: Double): Double {
        return quiz * 0.3 + (aktivitas * 0.7)
    }

    fun hitung_nilai_akhir(utsMhs: Double, uasMhs: Double, tugasMhs: Double, jnskur: jenis_kurikulum): Double {
        return jnskur.hitung_nilai_bobot(utsMhs, uasMhs, tugasMhs)
    }
}
class db_khs {
    fun simpan_na_db(nim: String, nama: String, nilaiAkhir: Double): String {
        return "KHS $nim nama $nama dapat nilai $nilaiAkhir"
    }
    fun load_db(nim: String): String {
        return "berhasil load data $nim"
    }
}






interface jenis_kurikulum {
    fun hitung_nilai_bobot(uts: Double, uas: Double, tugas: Double): Double {
        return 1.0
    }
}
class kurikulum_2013: jenis_kurikulum {
    override fun hitung_nilai_bobot(uts: Double, uas: Double, tugas: Double): Double {
        return (uts * 0.3) + (uas * 0.4) + (tugas * 0.3)
    }
}

    class kurikulum_merdeka : jenis_kurikulum {
        override fun hitung_nilai_bobot(uts: Double, uas: Double, tugas: Double): Double {
            return (uts * 0.2) + (uas * 0.3) + (tugas * 0.5)
        }
    }


class manager_hitung_khs {
    fun mulai_perhitungan(quizTugas: Double, aktivtasTugas: Double, utsKamu: Double, uasKamu: Double, jnskur: jenis_kurikulum): Double {
        val khsMhs = proses_khs()
        val nilaiTugas: Double = khsMhs.hitung_nilai_tugas(quizTugas, aktivtasTugas)
        val nilaiAkhirMhs: Double = khsMhs.hitung_nilai_akhir(utsKamu, uasKamu, nilaiTugas, jnskur)
    }
}

class manager_db {
    fun mulai_simpan(nimMhs: String, namaMhs: String, naMhs: Double): String {
        val dbMhs = db_khs()
        return dbMhs.simpan_na_db(nimMhs, namaMhs, naMhs)
    }
}



    fun main() {
        val mngKhs = manager_hitung_khs()
        val mhs1: Double = mngKhs.mulai_perhitungan(85.73, 87.30, 70.36, 93.57, kurikulum_2013())
        val mhs2: Double = mngKhs.mulai_perhitungan(85.73, 87.30, 70.36, 93.57, kurikulum_merdeka())

        val managerDB = manager_db()
        println(managerDB.mulai_simpan("123", "ucok", mhs1))
        println(managerDB.mulai_simpan("321", "intan", mhs2))

        val khsMhs = proses_khs()
        val nilaiTugas: Double = khsMhs.hitung_nilai_tugas(83.57, 94.45)
        val naMhs1: Double = khsMhs.hitung_nilai_akhir(
            85.67, 70.40,
            nilaiTugas, kurikulum_merdeka()
        )
        val naMhs2: Double = khsMhs.hitung_nilai_akhir(
            85.67, 70.40,
            nilaiTugas, kurikulum_2013()
        )

        val dbMhs = db_khs()
        val statusSimpan1: String = dbMhs.simpan_na_db("123", "titus", naMhs1)
        val statusSimpan2: String = dbMhs.simpan_na_db("321", "ani", naMhs2)

        println(statusSimpan1)
        println(statusSimpan2)


    }
