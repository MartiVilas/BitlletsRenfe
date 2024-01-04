package org.example

import java.util.Scanner

val scanner: Scanner = Scanner(System.`in`)

fun main() {
    var seguirComprando: String
    val preciosBase = arrayOf(2.40, 11.35, 40.00, 10.00, 80.00)

    do {
        println("Quin bitllet desitja adquirir?")
        println("1 - Bitllet senzill\n2 - TCasual\n3 - TUsual\n4 - TFamiliar\n5 - TJove")
        val tipoBillete = llegirIntMissatge("Selecciona el tipus de bitllet (1-5): ", "ERROR: Cal introduir un nombre enter.")

        println("Has escollit la opció: ${getNombreBillete(tipoBillete)}")

        val zona = llegirInt("Quina zona vol viatjar? (1, 2 o 3): ", "ERROR: Cal introduir un nombre enter per la zona.", "ERROR: La zona ha de ser 1, 2, o 3", 1, 3)

        val cantidad = llegirInt("Quantitat de bitllets (màxim 3): ", "ERROR: Cal introduir un nombre enter per la quantitat.", "ERROR: Només pots comprar fins a 3 bitllets.", 1, 3)

        val precioTotal = calcularPrecio(preciosBase[tipoBillete - 1], zona, cantidad)
        println("El preu del billet es ${precioTotal}€")

        var pago = 0.0
        while (pago < precioTotal) {
            pago += llegirFloat("Introdueixi monedes o bitllets vàlids de EURO:", "ERROR: Cal introduir un nombre vàlid.")
            if (pago < precioTotal) {
                println("Falten ${(precioTotal - pago)}€")
            }
        }

        val cambio = pago - precioTotal
        println("El seu canvi és ${cambio}€. Reculli els seus bitllets.")

        val quiereTiquet = llegirChar("Vols el tiquet? [S,N]", "ERROR: Cal introduir 'S' o 'N'.")

        if (quiereTiquet.equals('S', ignoreCase = true)) {
            println("------TIQUET------")
            println("${getNombreBillete(tipoBillete)} zona $zona - Preu: ${precioTotal}€")
            println("------------------")
            println("Reculli el teu tiquet.\nAdeu!!")
        }

        println("Vols seguir comprant? [S,N]")
        seguirComprando = llegirWord("Introdueixi 'S' per continuar o 'N' per acabar: ", "ERROR: Cal introduir 'S' o 'N'")
    } while (seguirComprando.equals("S", ignoreCase = true))
}
