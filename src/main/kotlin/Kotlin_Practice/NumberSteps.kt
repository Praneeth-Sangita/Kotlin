package Kotlin_Practice

class NumberSteps(a:Int,step_val:Int) {
    var a=a
    var step_val=step_val
    fun prints(){
        for(i in 1..a step step_val){
            println(i)
        }
    }
}
fun main(){
    println("Enter the last value")
    var a:Int= Integer.valueOf(readLine())
    println("Enter the step value")
    var step_val:Int=Integer.valueOf(readLine())
    var ns=NumberSteps(a,step_val)
    ns.prints()
}