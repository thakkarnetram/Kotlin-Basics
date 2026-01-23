package conditions

fun main(){
    /* when statements can be used in 3 cases
    * use when as an expression
    * use when with a value
    * use when with a value as an expression
    * */
    val password = readlnOrNull()
    // can be used this way as well
    val adminPassword = when {
        password == "admin@123" -> "Admin Access granted"
         else -> "Basic access granted"
    }
    // this is when as an expression
    val hasAccess = when {
        password?.contains("superadmin") == true -> {
            true
        }
        else -> { false }
    }
    when (hasAccess) {
        true -> println("Super Admin Access Granted ")
        else -> println("Basic Access Granted")
    }
    // another way to write conditions using when.
    // when with a value
    when(password) {
        "admin@123" -> println("Full access to database")
        "admin@12345" -> println("Full access to server control")
        else -> println("Limited access to codebase")
    }
    when {
        password == "" -> {
            println("Password cannot be empty")
        }
        // can be written as password?.length!! < 7 for null checks
        password == null || password.length < 7 -> {
            println("Password must be more than 7 characters")
        }
        else -> {
            println("Password created")
        }
    }
    println(adminPassword)
    findProbability()
}

// another example usage of when
fun findProbability() {
    // ? indicates null safety checks
    val probability : Int? = readlnOrNull()?.toInt();
    if (probability != null) {
        when {
            probability < 40 -> println("Less Chances")
            probability <= 80 -> println("More Chances")
            probability < 100 -> println("100% Chances")
            else -> println("No Idea")
        }
    }
}