package casting

fun smartCast ( a : Any) {
    when (a) {
        is String -> {
            println("a is a String and length is ${a.length}")
        }

        is Int -> {
            val multiply = a * a;
            println("a is Int type and its value is $multiply")
        }

        else -> {
            println("a is not a string nor int type")
        }
    }
}
fun main() {
    smartCast("String")
    smartCast(12)
}