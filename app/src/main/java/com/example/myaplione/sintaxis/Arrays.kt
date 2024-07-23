package com.example.myaplione.sintaxis

fun main() {

    val weekDay = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    //Bucle para el Array
    for (position in weekDay.indices){
        println(weekDay[position])
    }

    for ((position, value) in weekDay.withIndex()){
        println("$position y $value")
    }
}