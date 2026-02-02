package functions

// passing default args helps to improve code readability and knowing what the parameter expects/needs
fun main(){
    openBrowser("www.github.com")
    openBrowser("www.youtube.com",true)
    printNames("John "," Doe ")
    printNames("David "," Miller ")
}

fun openBrowser(url:String,isPrivate: Boolean = false) {
    println("Opening $url " + if (isPrivate) " in private window " else " in normal window")
}

fun printNames(name:String = "Hello ",lastName: String = "World") {
    println("$name $lastName")
}
