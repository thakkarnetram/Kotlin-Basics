package operations

var canPlayGamesFullDay = false
var canPlayGamesHalfDay = false
fun main(){
    val userInput =  readlnOrNull()
    var finishWork = false
    var cleanHome = false
    if(userInput == "1") {
        finishWork = true
        cleanHome = false
    } else if (userInput == "3") {
        finishWork = false
        cleanHome = true
    } else if (userInput == "done" || userInput == "Done") {
        finishWork = true
        cleanHome = true
    } else {
        finishWork = false
        cleanHome = false
    }
    playGames(finishWork,cleanHome)
}

fun playGames(finishWork: Boolean,cleanRoom: Boolean){
    if(finishWork && cleanRoom) {
        canPlayGamesFullDay = true
        println("You can play games today for 24h ")
    } else if (finishWork || cleanRoom) {
        canPlayGamesHalfDay = true
        println("You can play games today for 12h ")
    } else {
        canPlayGamesFullDay = false
        canPlayGamesHalfDay = false
        println("You cannot play games today ")
    }
}