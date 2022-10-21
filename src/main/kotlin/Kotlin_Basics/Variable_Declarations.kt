package Kotlin_Basics

fun main() {
    var age = 10 //var can be overriden
    val pi = 3.14 //val cannot be overriden
    var firstName="Praneeth"
    var lastName="Sangita"
//    var name="Krishna"
//    name=10
//    (var gender) //This variable must either have a type annotation or be initialized
    var gender:String
    gender="Male"
    println(age+pi)
    println("First Name : "+firstName)
    print("Full Name : "+firstName+lastName+"\n")
    println("Age : "+age)
    println("Gender : "+gender)
    println("Age is of type : "+age::class.simpleName)
    println("First Name is of type : "+firstName::class.simpleName)
}
