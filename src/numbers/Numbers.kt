package numbers

fun main() {
    val a = 1
    val b = 13313413131L
    val c = 10.24
    val d = 120.3f
    print(a::class.simpleName + "\n")
    print(b::class.simpleName+ "\n")
    print(c::class.simpleName+ "\n")
    print(d::class.simpleName+ "\n")
    print(123+456*789)
    print("\n")
    print(1+2*3+4*5+6*7+8*9)
    print("\n")
    print((1 + 2) * 3 + 4 * 5 + 6 * (7 + 8) * 9)
    print("\n")
    scoreGame()
}

fun scoreGame(){
    val scoreLevel1=79
    val scoreLevel2=92
    val scoreLevel3=86
    val totalScore = scoreLevel1+scoreLevel2+scoreLevel3
    val averageScore = totalScore/3
    println(totalScore)
    println(averageScore)
    val bootMultiplier = 4
    val scoreBoost = totalScore * bootMultiplier
    val finalBoostedScore = totalScore + scoreBoost
    println(scoreBoost)
    println(finalBoostedScore)
}