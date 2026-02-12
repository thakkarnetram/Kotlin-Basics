package modifiers

open class BankAccount (
    private var accountBalance : Int,
    // protected is only visible to its own and child classes
    protected var bankName : String
) {
    // making this private so other classes cannot access it
    // we don't want other class making changes to this
    // making a val/var/methods/interfaces/fun/class open allows other files and classes to get access of it.
    // INTERNAL modifier is used when we ship a module or library and only the library can use that method or class
    // example - If I have a library / module for getting weather forecast and I use it inside my application , if any method,var,class is marked as internal in
    // the library it can't be used inside my application
    private var canWithdraw : Boolean = false
    fun depositAmount(amountToDeposit : Int) {
        accountBalance+=amountToDeposit
        println("Amount deposit success ! Updated balance in your account is $accountBalance")
    }
    fun withdrawAmount(amount : Int) {
        if(accountBalance >= amount) {
            canWithdraw = true
            accountBalance -= amount;
            println("$amount is in process for withdrawal and your updated balance is $accountBalance")
        } else {
            canWithdraw = false
            println("Withdrawal of $amount can't be processed due to insufficient balance $accountBalance")
        }
    }
    fun checkBalance () {
        println("Your current balance is $accountBalance")
    }
    fun getBankName() {
        println("Your Bank Account is in $bankName and has a balance of $accountBalance")
    }
}

//fun main() {
//    val person = BankAccount(3200)
//    person.depositAmount(3000)
//    person.withdrawAmount(5000)
//    person.checkBalance()
//}