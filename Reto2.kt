package com.example.introkotlin1.introduccion

class Reto2 {
}

fun main(){
    print ("Doctora, ¿cuánto pesa el bebé? \n")
    var peso = readLine()!!.toInt()
    print ("Doctora, ¿cuántos meses tiene el bebé? \n")
    var meses = readLine()!!.toInt()
    var arriba = (peso + 10)*8
    var abajo = meses * 10
    var conversion = arriba/abajo
    print("Doctora, la dosis para el bebé es $conversion")
}