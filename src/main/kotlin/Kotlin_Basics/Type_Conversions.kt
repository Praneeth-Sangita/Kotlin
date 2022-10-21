package Kotlin_Basics

fun main(){
    var num1:Int=10
//    var num2:Float=num1 -> This kind of type conversion is not possible in kotlin,We should only us functions such as toFloat() etc...
    var num2 : Float=num1.toFloat()
    var num3 : Byte=num1.toByte()
    println(num1)
    println(num2)
    println(num3)
}
