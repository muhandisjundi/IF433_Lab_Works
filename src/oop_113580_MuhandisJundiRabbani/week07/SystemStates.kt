package oop_113580_MuhandisJundiRabbani.week07

enum class Appstate {
    STARTING, RUNNING, STOPPED
}

sealed class ApiResponse {
    data class Success(val data: DataUser) : ApiResponse()
    data class Error(val message: String) : ApiResponse()
    object Loading : ApiResponse()
}