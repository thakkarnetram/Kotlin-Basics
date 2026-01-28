package controlFlow

fun main(){
    val userInput = readlnOrNull()
    val random = (0..15).random()
    val a = 10
    val b = 20
    val x = 0
    val e = 10
    val d = 3
    val letters = listOf("val1","val2","val3","val4")
    while(userInput == "admin") {
        println("Admin has the control system")
        if(random < 5) {
            println("Low access admin $random")
            break
        } else {
            println("High access admin $random")
            break
        }
    }
    // normal for loop
    for (i in random..<10) {
        println(i)
    }
    // step is used for having a difference between 2 values ex if step is 2 then loop will be 0,2,4,6....
    for ( i in 0..10 step 2){
        println(i)
    }
    // downTo is for descending order i.e. 15 , 13 , 11 ....
    // step is again for desired difference between 2 values
    for ( i in 15 downTo 2 step 2){
        println(i)
    }
    // until excludes the last value i.e. here 5 will be excluded , this can be written as ..< as well
    for (i in 1 until 5) {
        println(i)
    }
    for (i in letters  ) {
        println(i)
    }
    for (x in a..b) {
        println(x)
    }
    for (i in x..e step d) {
        println(i)
    }
}