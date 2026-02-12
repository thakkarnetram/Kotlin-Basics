package modifiers

fun main(){
    // here I cant access bankAccount class if its private but if I make it open I can access
    val person = BankAccount(50000,"Kotak Mahindra Bank")
    // I can't access this variable as its private and ofc we don't want this variable to be accessed by someone to tamper the logic
//    person.canWithdraw = true
    person.checkBalance()
    person.getBankName()
    person.withdrawAmount(4000)
    person.depositAmount(3000)
}