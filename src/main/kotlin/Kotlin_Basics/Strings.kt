package Kotlin_Basics

fun main(){
    var txt1="Hello I am Praneeth Sangita"
    var txt2="Hello World"
    var txt3="Hello World"
    println(txt1.length)
    println(txt1[0])
    println(txt1[1])
    println(txt1[12])
    println(txt1.toUpperCase())
    println(txt1.compareTo(txt2))
    println(txt2.compareTo(txt3))
    println(txt1.indexOf("Praneeth"))
    println(txt1.indexOf('a'))
    println(txt1.indexOf(' '))
    println(txt2.plus(txt3))
}