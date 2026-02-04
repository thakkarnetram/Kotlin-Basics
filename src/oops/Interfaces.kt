package oops

// interfaces do not define the body and assignment of values that are defined
interface Human {
    val gender : String
    fun typeOfWork()
}

class Male (
    val name:String,
    override val gender: String,
    val work : String
) : Human {
    override fun typeOfWork() {
        println("$gender named $name is a Human and works as $work")
    }
}

class Female (
    val name: String,
    override val gender: String,
    val work: String
) : Human {
    override fun typeOfWork() {
        println("$gender named $name is a Human and works as $work")
    }
}

fun main(){
    val female = Female("Jes","Female","HR");
    val male = Male("Mick","Male","SDE");
    println(female.typeOfWork())
    println(male.typeOfWork())
}