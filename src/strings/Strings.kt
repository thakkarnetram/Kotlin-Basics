package strings

fun main() {
//    values in var can be re-assigned
//    values in val cannot be re-assigned ( similar to const )
    var s1 = "Hello"
    println(s1)
    val s2 = String("String is converted to char array".toCharArray())
    s1 = "Hi S1 Changed "
    println(s1)
    println(s2)
    stringTemplates()
    comparisonOfStrings()
}

fun stringTemplates(){
    val name = "Joe"
    val age = 23
    println("Dummy username is $name")
    println("Dummy age is $age")
    println(name.length)
    println(name[0])
    println(name.last())
}