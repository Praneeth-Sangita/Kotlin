package Kotlin_Basics

import java.util.Scanner

fun main(){
    var x= Integer.valueOf(readLine())
    when(x){
        1 -> println("one")
        2 -> println("two")
        3 -> println("three")
        4 -> println("four")
        5 -> println("five")
        6 -> println("six")
        else -> println("Out of bounds")
    }
}