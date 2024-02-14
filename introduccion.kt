package com.example.introkotlin1.introduccion

class introduccion {
}

fun main(){
    print("hello world \n") //es uno normal
    println("hola") //lo imprime con new line
    var variable:String = "holis"
    print("mi variable tiene $variable \n")

    print("ingrese su nombre: ")
    var nombre= readLine()!!.toString() //me coge lo que mete la persona y lo convierte a string
    print("usted ha ingresado $nombre")
}
//uso val cuando son valores que nunca van a cambiar
//uso var cuando son variables que si cambian