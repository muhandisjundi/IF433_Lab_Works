package oop_113580_MuhandisJundiRabbani.week07

sealed class Hasil {
    data class sukses (val data: String) : Hasil()
    data class error (val ex: Exception) : Hasil()
    object loading:Hasil()

    fun handle_response(res: Hasil){
        when(res){
            is sukses -> {println("sukses lempar data")}
            is error -> {println("error ${res.ex}")}
            loading -> {println("loading")}
        }
    }
}