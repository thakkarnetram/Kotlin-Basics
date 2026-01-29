package controlFlow

fun main(){
    // eg of nested loops
    for (i in 1..10) {
        for(j in 2..5) {
            println("i $i and j $j")
            break
        }
    }
    println()
    basicPattern()
    println()
    starPattern()
}
// basic patterns
fun basicPattern(){
    //  star pattern
    for (i in 1..10) {
        for(j in 1..i) {
            print("*")
        }
        println()
    }

    //reverse order stars
    for(i in 1..10) {
        val noOfStars = 11 - i;
        for(j in 1..noOfStars) {
            print("*" )
        }
        println()
    }
}
fun starPattern(){
    val width = 5
    // this loop goes upward
    // adding a step leaves a gap between values if needed
    for ( i in 1 until width ) {
        for(j in 1..i) {
            print("*")
        }
        println()
    }
    // this loop goes downwards
    for(i in width downTo  1  ){
        for(j in 1..i) {
            print("*")
        }
        println()
    }
}