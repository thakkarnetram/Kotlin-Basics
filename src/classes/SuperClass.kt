package classes

// Superclass
open class Mammal {
    fun fetchChildren(name: String){
        println("Fetching children for $name .....")
    }
}

// child class
open class Doggie(open val name:String) : Mammal() {
    fun fetchBall() {
        println("Fetching Balls for $name .....")
    }
}

// class inheritance from other class gets all the behavior of the parent class
class Labrador(override val name: String) : Doggie("Maxie") {
    fun myLabBarks() {
        println("$name is a labrador and it braks cutely ")
    }
}

// this is how super and child classes work in Kotlin .
fun main(){
    val dog = Doggie("Maxie")
    dog.fetchChildren(dog.name)
    dog.fetchBall()
    println(dog.name)
    // this class inherits other class which takes all functions of its superclass
    val lab = Labrador("Maxes The Lab")
    lab.myLabBarks()
    lab.fetchBall()
    lab.fetchChildren(lab.name)
    println(lab.name)
}