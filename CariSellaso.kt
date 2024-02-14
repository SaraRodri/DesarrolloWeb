package com.example.introkotlin1.introduccion.estructurasAlgoritmicas

class CariSellaso {
}

fun main(){
    println("¿Cuántas veces quiere jugar?")
    val veces = readLine()!!.toInt()
    for (i in 1..veces){
        val carisellaso = 0..1
        var sorpresa:Int = carisellaso.random()
        println("Escoja, cara o sello:")
        var jugador = readLine()!!.toString().lowercase()
        var jugador_res:Int = 3
        when (jugador){
            "cara"-> jugador_res = 0
            "sello"-> jugador_res = 1
        }
        if (sorpresa == jugador_res){
            println("Ganaste :)")
        } else {
            println("Perdiste :(")
        }
    }

}
