package oop_113580_MuhandisJundiRabbani.week03

class Employee(val name: String) {
    var salary: Int = 0
        set(value) {
            println("menciba set gaji ke: $value")
            //peringatan kode di bawah ini salah & berbahaya
            //kita memanggil setter di dalam setter (recursive)
            this.salary = value
        }
}