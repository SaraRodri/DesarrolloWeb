package com.example.introkotlin1.introduccion

import kotlin.math.sqrt

class Reto3 {
}
fun main(){
    print ("Dime el primer número \n")
    var n1 = readLine()!!.toFloat()
    print ("Dime el segundo número \n")
    var n2 = readLine()!!.toFloat()
    println("¿Qué quieres? (suma, resta, multiplicacion," +
            "division, sqrt1, sqrt2, potencia)")
    var res = readLine()!!.toString()
    if (res == "suma"){
        println("($n1 + $n2)= ${n1 + n2}")
    }
    else if (res == "resta"){
        println("($n1 - $n2)= ${n1 - n2}")
    }
    else if (res == "multiplicacion"){
        println("($n1 x $n2)= ${n1 * n2}")
    }
    else if(res == "division"){
        println("($n1 / $n2)= ${n1 / n2}")
    }
    else if (res == "sqrt1"){
        println("sqrt($n1)= ${sqrt(n1)}")
    }
    else if (res == "sqrt2"){
        println("sqrt($n2)= ${sqrt(n2)}")
    }
    else {
    println("$n1 ** $n2 = ${Math.pow(n1.toDouble(), n2.toDouble())}")}
}
