package oop_113580_MuhandisJundiRabbani.week09

import javax.swing.plaf.nimbus.State

data class TradeLog(
    val pair: String,
    val position: String,
    val leverage: Int,
    val roe: Double,
    val status: String
)
