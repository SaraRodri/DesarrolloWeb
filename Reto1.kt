package com.example.introkotlin1.introduccion

class Reto1 {
}
fun main(){
    print ("Abuelita, ¿cuántos grados te pongo en el horno?" +
            "(Dímelos en Farenheit por favor) \n")
    var grados = readLine()!!.toInt()
    var conversion = (grados - 32) * 5/9
    print("Abuelita, ponle a tu horno $conversion grados celsius")
}