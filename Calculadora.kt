package com.example.introkotlin1.introduccion.estructurasAlgoritmicas

import kotlin.math.sqrt

class Calculadora {
}

fun main(){
    print ("Dime el primer número \n")
    var n1 = readLine()!!.toFloat()
    print ("Dime el segundo número \n")
    var n2 = readLine()!!.toFloat()
    println("Suma(1), Resta(2), Multiplicacion(3), " +
            "División(4), Sqrt1(5), Sqrt2(6), Potencia(7)")
    var res = readLine()!!.toInt()
    when (res){
        1-> println("$n1 + $n2= ${n1 + n2}")
        2-> println("$n1 - $n2= ${n1 - n2}")
        3-> println("$n1 x $n2= ${n1 * n2}")
        4-> println("$n1 / $n2= ${n1 / n2}")
        5-> println("sqrt($n1)= ${sqrt(n1)}")
        6-> println("sqrt($n2)= ${sqrt(n1)}")
        7-> println("$n1 ** $n2 = ${Math.pow(n1.toDouble(), n2.toDouble())}")
        else-> println("ERROR")
    }
}