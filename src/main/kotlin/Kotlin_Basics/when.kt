package Kotlin_Basics

import java.util.Scanner

fun main(){
    var x= Integer.valueOf(readLine())
    when(x){
        in 21..100 -> println("ok")
        !in 21..100 -> println("ok")
    }
}