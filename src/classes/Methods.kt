package classes

class Barista (val name: String) {
    // this method depends on the coffee class so returns the coffee class itself
    fun prepareCoffee(type: String,size: Int) : Coffee {
        println("Coffee type $type of size $size")
        return Coffee(type,size)
    }
    // this method class the above method and performs action of its own too
    fun serveCoffee(type:String,size:Int){
        val result = prepareCoffee(type,size)
        println("$result is being served by $name" )
    }
}
class Coffee (val name : String, val size : Int) {
    // need to override toString in order to print the message inside serveCoffee
    // override is needed because by default kotlin prints the hashCode for the class
    override fun toString(): String {
        return "$name coffee of size $size"
    }
}

// another example of classes and methods
// class can be passed as argument as well
class Dog(val name: String) {
    var isHungry = true
}

fun feedDog(dog: Dog) {
    println("Feeding ${dog.name} as isHungry is ${dog.isHungry}")
    dog.isHungry = false
    println("Feed the ${dog.name} as isHungry is ${dog.isHungry}")
}

fun main(){
    val barista = Barista("John")
    barista.serveCoffee("Espresso",2)
    val dog = Dog("Lab")
    feedDog(dog)
}