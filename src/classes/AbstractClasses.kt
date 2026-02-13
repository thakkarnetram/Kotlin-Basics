package classes

// diff between interface and abstract classes
// interfaces are always open to other class and abstract classes are not.
// a class can inherit multiple interfaces whereas abstract classes can inherit from one class only

abstract class EmployeeData(
    private val company : String,
    private val employeeName : String = "John"
) {
    abstract fun getCompanyList()
    abstract fun getEmployeeDirectory()
}

open class Company (private val company: String) : EmployeeData(company, "Mike") {
    fun getCompanyName () {
        when (company) {
            "Google" -> {
                println("You are in Big MNC")
            }
            "Microsoft" -> {
                println("You are in Big MNC")
            }
            else -> {
                println("You are in a $company")
            }
        }
    }

    override fun getCompanyList() {
        println("Company List")
    }

    override fun getEmployeeDirectory() {
        println("Employee Directory")
    }
}

open class Google : Company ("Google") {
    fun getWelcomeKit() {
        println("Welcome to Google , your kit will be delivered soon !")
    }
}

open class Departments (private val department : String) : Google () {
    fun getDepartment() {
        when (department) {
            "Production" -> {
                println("$department is a Great department !")
            }
            "Design" -> {
                println("Out of the box thinkers in this $department department")
            }
            else -> {
                println("Welcome to the $department mate !")
            }
        }
    }
}

class Person (
    private val name : String
) : Departments("Production") {
}

fun main() {
    val person = Person("Mike")
    person.getCompanyName()
    person.getWelcomeKit()
    person.getDepartment()
}