package com.example.myaplione.sintaxis

fun main() {
    ifBasic()
}

fun ifBasic() {
    val name:String = "Rafa"

    if(name == "Rafa"){
        println("Hola Rafa")
    }else if(name !== "Rafa"){
        println("Hola $name")
    }


}