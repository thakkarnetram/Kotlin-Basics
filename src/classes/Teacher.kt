package classes

import java.time.LocalDate

// getters and setters in kotlin are auto generated so
// no need of explicitly adding getName or setName.
class Teacher (
    val id: Int,
    var name : String,
    val birthDay: LocalDate,
    val experience:Int,
    val subjects: Array<String>,
) {
    fun giveNameWithExp () : String {
        return "$name has ($experience) years"
    }
}

fun main() {
    val teacher1 = Teacher(
        id = 1,
        name = "Jon",
        birthDay = LocalDate.of(1998,2,12),
        experience = 3,
        subjects = arrayOf("English","Maths","CS")
    );
    println(teacher1.id)
    println(teacher1.name)
    println(teacher1.birthDay)
    println(teacher1.experience)
    println(teacher1.subjects.forEach { print(it) })
    println(teacher1.giveNameWithExp())
}