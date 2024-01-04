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
fun calcularPrecio(precioBase: Double, zona: Int, cantidad: Int): Double {
    val factorZona = when (zona) {
        2 -> 1.3125
        3 -> 1.8443
        else -> 1.0 // Zona 1 no tiene incremento
    }
    return precioBase * factorZona * cantidad
}