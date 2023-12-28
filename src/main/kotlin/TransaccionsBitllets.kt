package org.example

fun getNombreBillete(tipoBillete: Int): String {
    return when (tipoBillete) {
        1 -> "Bitllet senzill"
        2 -> "TCasual"
        3 -> "TUsual"
        4 -> "TFamiliar"
        else -> "TJove"
    }
}
