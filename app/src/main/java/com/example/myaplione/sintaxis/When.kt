package com.example.myaplione.sintaxis

fun main() {
    getMonth(1)
}

fun getMonth(month: Int) {
    when (month) {
        1 -> println("Enero")
        2 -> println("Febrero")
        else -> println("No esta")
    }
}