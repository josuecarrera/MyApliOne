package com.example.myaplione.sintaxis

fun main() {
    //inmutableList()
    mutableList()
}

fun mutableList() {
    val weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    weekDays.add(index = 0,"RafaDay")
    println(weekDays)
}

fun inmutableList() {
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

   // println(readOnly.size)
   // println(readOnly)

    //Filtrar la lista
   // val filtro = readOnly.filter { it.contains("a") }
  //  println(filtro)

    //Iterar
    readOnly.forEach { weekDay -> println(weekDay) }
}