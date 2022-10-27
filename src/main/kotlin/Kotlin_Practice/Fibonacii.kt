package Kotlin_Practice

class Fibonacii(value:Int) {
    var value:Int=value
    var first=0
    var second=1
    var temp=0
    fun fib(){
        for (i in 1..value){
            temp=first+second
            first=second
            second=temp
            println(temp)
        }
    }
}
fun main(){
    println("Enter the fibanacii range")
    var value:Int=Integer.valueOf(readLine())
    var f=Fibonacii(value)
    f.fib()

}