package Kotlin_Practice

abstract class Case {
    abstract fun toLowerCase(str: String?)
    abstract fun toUpperCase(str:String?)
}
class CaseChange: Case() {
    var str:String=""
    override fun toLowerCase(str: String?) {
        println(str?.lowercase())
    }

    override fun toUpperCase(str: String?) {
        println(str?.uppercase())
    }

}

fun main(){
    var str: String? = readLine()
    var cc=CaseChange()
    cc.toLowerCase(str)
    cc.toUpperCase(str)
}