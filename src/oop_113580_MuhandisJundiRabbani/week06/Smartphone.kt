package oop_113580_MuhandisJundiRabbani.week06

//eror karena smartphone inhereits multiple implementation
class Smartphone : Camera, Phone {
    //manually override to resolve ambiguity
    override fun turnOn() {
        super<Camera>.turnOn() //menjalankan logika camera
        super<Phone>.turnOn() //menjalankan logika phone
        println("sistem operasi smartphone berhasil booting")
    }
}