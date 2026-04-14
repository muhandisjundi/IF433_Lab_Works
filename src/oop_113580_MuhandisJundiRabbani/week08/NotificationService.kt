package oop_113580_MuhandisJundiRabbani.week08

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {
        //sendEmail(user.email) //ini akan error

        if(user.email != null){
            //success via smart cast: compiler tahu user.email pasti tidak null di blok ini
            sendEmail(user.email)
        } else{
            println("user ${user.name} tidak memiliki email")
        }
    }
}