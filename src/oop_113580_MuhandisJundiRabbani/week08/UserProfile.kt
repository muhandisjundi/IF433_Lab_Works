package oop_113580_MuhandisJundiRabbani.week08

//name adalah non null (wajib), email dan phone adalah nullable opsiaonal
class UserProfile(
    val name: String,
    val email: String?,
    val phone: String? = null //default argument null
)

