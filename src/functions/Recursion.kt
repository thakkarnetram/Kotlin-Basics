package functions

fun main() {
    println(factorial(15))
    println(factorial(5))
    println(factorial(4))
}

fun factorial(input: Int): Int {
    if (input <= 1) {
        return 1
    }
    return factorial(input - 1) * input
}