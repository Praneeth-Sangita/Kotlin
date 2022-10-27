package UdemyExercises

fun  main(){
    var mp=MobilePhone("Android","Samsung","Samsung s20 Ultra")
    mp.chargeBattery(10)
}
class MobilePhone(osName:String,brand:String,model:String){
    var battery=30
    init {
        println("Model is $model with os  $osName of brand $brand ")
    }
    fun chargeBattery(chargedBy:Int){
        println("$battery after charge ${battery+chargedBy}")
        battery+=chargedBy
    }
}