fun main() {
    var Toyota=car("Toyota","vx","KBC",20)
    println(Toyota.make)
    println(Toyota.model)
    println(Toyota.registration)
    println(Toyota.speed)
    println(Toyota.aceleration(20))
    println(Toyota.deceleration(10))
    Toyota.stop()
    println(Toyota.speed)

}

class car(var make: String, var model: String, var registration: String, var speed: Int) {


fun aceleration(aceleration: Int):Int {
    speed += aceleration
    return speed



}
fun deceleration(deceleration:Int):Int{
    speed-=deceleration
    return speed
}
    fun stop(){
        speed=0
    }
}




