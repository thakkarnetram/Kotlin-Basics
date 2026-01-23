package conditions

fun main(){
    val password = readlnOrNull()
    // can be used this way as well
    val adminPassword = when {
        password == "admin@123" -> "Admin Access granted"
         else -> "Basic access granted"
    }
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
    // another way to write conditions using when
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
}