package specialClasses

//class Doggo(
//    val name : String,
//    val age : Int
//)
data class Doggo(
    val name : String,
    val age : Int
)

fun main() {
    val dog1 = Doggo("Joe",3)
    val dog2 = Doggo("John",3)
    // can create a copy to modify the age
    val oldDog2 = dog2.copy(age = 33)
    // destructuring
    val (name,age) = dog2
    val (names,ages) = oldDog2
    println(name)
    println(names)
    println(ages )
    println(age )
    val dog3 = Doggo("Joe",3)
    // this won't give right answer as objects are not equal and each of them have their own address
    // eg Dog 1 might have Doggo@13ivfji , Dog 2 might have Doggo@vjeoc
    // for this we can use the data class type
    // now cause we used the data class type dog1 and dog3 are the same now
    println(dog1 == dog1)
    println(dog1 == dog2)
    println(dog1 == dog3)
}