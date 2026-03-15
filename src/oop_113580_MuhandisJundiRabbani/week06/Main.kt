package oop_113580_MuhandisJundiRabbani.week06

//fungsi ini decoupled tidak peduli kelas aslinya
fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> memulai checkout...")
    method.pay(amount) //dynamic polymorphism in action
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKPUT ===")
    processCheckout(pay1, amount = 50000.0)
    processCheckout(pay2, amount = 50000.0)


    println("\n=== TESTING SPEAKER ===")
    val lamp = SmartLamp("L001","Ruang Tamu")
    val speaker = SmartSpeaker("S001","Google Nest Dapur")
    val cctv = SmartCCTV("C001", "Ezviz Garasi")

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}