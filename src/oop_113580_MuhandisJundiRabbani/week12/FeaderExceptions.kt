package oop_113580_MuhandisJundiRabbani.week12

sealed class FeaderExceptions(msg: String) : Exception(msg)

class FoodEmptyException(requested: Int, available: Int) :
    FeaderExceptions("Kibble tidak cukup! Diminta \$requested gr, sisa\n" +
            "\$available gr")

class DispenserJamException : FeaderExceptions("wadah dispenser tersangkut/macet")