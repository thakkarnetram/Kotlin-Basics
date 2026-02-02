package classes

class Employee(
    val name:String,
    var position : String
)

fun main() {
    val employee1 = Employee("Doe","SDE")
    val employee2 = Employee("John","SWE")
    print(employee1.name + employee2.name + employee2.position + employee1.position)
}