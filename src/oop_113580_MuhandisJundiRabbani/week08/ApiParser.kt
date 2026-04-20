package oop_113580_MuhandisJundiRabbani.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        return try {
            val id = requireNotNull(rawJson["id"]) { "API Invalid: Missing ID" } as String
            val name = requireNotNull(rawJson["name"]) { "API Invalid: Missing Name" } as String

            val type = rawJson["type"] as? String

            when (type) {
                "ELECTRONIC" -> {
                    val warranty = rawJson["warranty"] as? Int ?: 12
                    Product.Electronic(id, name, warranty)
                }
                "CLOTHING" -> {
                    val size = rawJson["size"] as? String ?: "All Size"
                    Product.Clothing(id, name, size)
                }
                else -> {null}
                }
        } catch (e: IllegalArgumentException) {
            println("Parsing Error: ${e.message}")
            throw e
        }

    }
}