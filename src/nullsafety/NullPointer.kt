package nullsafety

var message : String? = "Null Type Check String"

fun main(){
    message = "null"
    if (message != null) {
        // !!.length says knowing that the value won't be null , this would crash if the value is null
        // ?.length use this instead cause if the value is null it returns null
//        var length = message!!.length
        val length = message?.length
        println(length)
    }else {
        println(null)
    }
}