package functions

// int kt we define functions like this
// fun nameOfFunction ( param name : type ) : type if it has a return value { function body }
fun main(){
    var result=0 ;
    result = addNumbers(4,5)
    printNumbers()
    println(result)
    result = biggerVal(45,3)
    println(result)
//    printLetters() cant access it here as it's a local function and only the parent can access it
}

fun printNumbers(){
    // the defined variables are scope variables and only accessible to this function
    val a = 10
    val b = 200
    println(a-b)
    fun printLetters() {
        val a = "bc"
        val b = "a"
        println(a+b)
    }
    printLetters()
}

fun addNumbers(a: Int, b:Int): Int {
    return a+b;
}

// Single Line functions
// here as this function has the task to only check one thing which val is bigger it can be finished in one line.
fun biggerVal (a : Int , b : Int) : Int = if (a > b) a else b