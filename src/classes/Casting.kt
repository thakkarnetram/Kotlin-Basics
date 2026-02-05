package classes

// Casting in Interfaces

interface Animals

class Horse(val name:String) : Animals {
    fun horseName() {
        println("Horsie name is $name")
    }
}

class Bird (val name : String): Animals {
    fun birdName(){
        println("Bird name is $name")
    }
}

fun checkIsHorse(animals: Animals){
    // is , is called to check its type
    if(animals is Horse) {
        println("Its a horse")
    } else {
        println("Its not a horse")
    }
    // another way to write this
    when(animals) {
        is Horse -> animals.horseName()
        is Bird ->  animals.birdName()
    }
}

fun main() {
    checkIsHorse(Horse("Kage"))
    checkIsHorse(Bird("Eagle"))
}