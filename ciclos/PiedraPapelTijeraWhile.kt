package com.example.introkotlin1.introduccion.ciclos

class PiedraPapelTijeraWhile {
}

fun main(){
    println("¿Cuántas vidas quiere?")
    var vidas = readLine()!!.toInt()
    while (vidas != 0) {
        val opciones = 1..3
        var sorpresa: Int = opciones.random()
        println("Escoja entre piedra, papel o tijera")
        var jugador = readLine()!!.lowercase()
        var jugando = 9
        when (jugador) {
            "piedra" -> jugando = 1
            "papel" -> jugando = 2
            "tijera" -> jugando = 3
        }
        if (jugando == 1){
            if (sorpresa == 1){
                println("Has empatado")
            }
            if (sorpresa == 2){
                println("Perdiste")
                vidas -= 1
            }
            if (sorpresa == 3){
                println("Ganaste")
            }
        }
        if (jugando == 2){
            if (sorpresa == 1){
                println("Ganaste")
            }
            if (sorpresa == 2){
                println("Has empatado")
            }
            if (sorpresa == 3){
                println("Perdiste")
                vidas -= 1
            }
        }
        if (jugando == 3){
            if (sorpresa == 1){
                println("Perdiste")
                vidas -= 1
            }
            if (sorpresa == 2){
                println("Ganaste")
            }
            if (sorpresa == 3){
                println("Has empatado")
            }
        }
    }
    println("Te has quedado sin vidas :(")
}
