package classes

class Employee(
    val name:String,
    var position : String
) {
    val label : String = "$name ($position)"
}

fun main() {
    val employee1 = Employee("Doe","SDE")
    val employee2 = Employee("John","SWE")
    println(employee1.name)
    println(employee1.position)
    println(employee2.name)
    println(employee2.position)
    employee2.position = "Senior SWE"
    println(employee1.label)
    println(employee2.label)
}