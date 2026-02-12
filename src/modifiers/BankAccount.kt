package modifiers

open class BankAccount (
    private var accountBalance : Int
) {
    // making this private so other classes cannot access it
    // we don't want other class making changes to this
    // making a val/var/methods/interfaces/fun/class open allows other files and classes to get access of it.
    private var canWithdraw : Boolean = false
    fun depositAmount(amountToDeposit : Int) {
        accountBalance+=amountToDeposit
        println("Updated balance in your account is $accountBalance")
    }
    fun withdrawAmount(amount : Int) {
        if(accountBalance >= amount) {
            canWithdraw = true
            accountBalance -= amount;
            println("$amount is in process for withdrawal")
        } else {
            canWithdraw = false
            println("Withdrawal of $amount can't be processed due to insufficient balance")
        }
    }
    fun checkBalance () {
        println("Your current balance is $accountBalance")
    }
}

//fun main() {
//    val person = BankAccount(3200)
//    person.depositAmount(3000)
//    person.withdrawAmount(5000)
//    person.checkBalance()
//}