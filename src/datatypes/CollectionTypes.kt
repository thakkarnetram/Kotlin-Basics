package datatypes

fun main(){
    // this is a collection / list type
    val listOfLetters = listOf("A","B","C")
    val newList = listOfLetters + "D"
    println(listOfLetters)
    println(newList)

    // in-built fun
    println(listOfLetters.size) // returns the size
    println(listOfLetters.isEmpty()) // checks if empty
    println(listOfLetters.last()) // returns the last element

    // this is a string type
    val str = "AB"
    val newStr = str + "C"
    println(str)
    println(newStr)

    // set
    // here in sets we cannot add duplicates
    val set : Set<String> = setOf("Element1","Element2","Element3")
    val newSet : Set<Set<String>> = setOf(set + "Element4")
    println(set)
    println(newSet)

    for (elements in newSet) {
        println(elements)
    }

    // map
    val indiaRoutes = mapOf("Delhi" to "Punjab","Mumbai" to "Delhi" , "Hyderabad" to "Assam")
    println(indiaRoutes)
    for (routes in indiaRoutes) {
        println(routes)
    }
}