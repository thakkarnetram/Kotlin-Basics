package finalproject

import java.time.LocalDate
import java.time.ZoneId

open class Bank () {
    open var accountTypeName : String = "";
    fun chooseAccountType( accountType : Int) {

        when (accountType) {
            1 -> {
                accountTypeName = "Debit Account";
                println("The selected option is $accountTypeName.")
            }
            2 -> {
                accountTypeName = "Credit Account";
                println("The selected option is $accountTypeName.")
            }
            3 -> {
                accountTypeName = "Checking Account";
                println("The selected option is $accountTypeName.")
            } else -> {
                accountTypeName = "None";
                println("Invalid input $accountTypeName")
            }
        }
    }

    fun depositMoney (amountToDeposit : Int, balance : Int) : Any {
        var accBalance = balance;
        accBalance += amountToDeposit;
        return println("$amountToDeposit is deposited to your account . Updated balance $accBalance");
    }

    fun withdrawMoney (amountToWithdraw : Int,balance: Int ) : Any {
        var accBalance = balance;
        if(accBalance > amountToWithdraw) {
            accBalance -= amountToWithdraw;
        } else {
            return println("Unable to withdraw amount . Insufficient Balance ! ")
        }
        return println("$amountToWithdraw is withdrawn from your account . Updated balance $accBalance");
    }
}

fun main() {
    println("Welcome to your banking system.")
    println("What type of account would you like to create?")
    println("1. Debit account")
    println("2. Credit account")
    println("3. Checking account")
    val accType = readln().toInt()
    val person1 = Bank()
    person1.chooseAccountType(accType)
    var accountBalance = (100000..500000).random()
    println("${person1.accountTypeName} has $accountBalance rs currently as of ${LocalDate.now(ZoneId.systemDefault())}")
    val moneyTransferred = (0..100000).random()
    println("${person1.accountTypeName} has $moneyTransferred rs transferred as of ${LocalDate.now(ZoneId.systemDefault())}")
    println("Please enter amount you want to deposit ")
    val depositAmount =  readln().toInt()
    person1.depositMoney(depositAmount,accountBalance)
    accountBalance += depositAmount;
    println("Please enter amount you want to withdraw ")
    val withdrawAmount = readln().toInt()
    person1.withdrawMoney(withdrawAmount,accountBalance)
    accountBalance -= withdrawAmount
    println("Final updated balance $accountBalance")
}