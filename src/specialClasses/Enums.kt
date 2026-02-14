package specialClasses

// in such cases enums are preferred as Strings can cause typo's and errors
// enums can be printed as strings normally .
// PAYMENT_METHOD.ordinal returns the position of the enum where it stands ex -> PAYMENT_METHOD.CASH.ordinal returns 0 , as it's the first element
enum class PAYMENT_METHOD {
    CASH,
    BANK_TRANSFER,
    CARD,
    CHEQUE
}
fun initiatePayment(amount:Int,method: PAYMENT_METHOD) {
    when(method) {
        PAYMENT_METHOD.CASH -> makePayment(amount, PAYMENT_METHOD.CASH, 4.0)
        PAYMENT_METHOD.BANK_TRANSFER -> makePayment(amount, PAYMENT_METHOD.BANK_TRANSFER,8.5)
        PAYMENT_METHOD.CARD -> makePayment(amount, PAYMENT_METHOD.CARD,12.0)
        PAYMENT_METHOD.CHEQUE -> makePayment(amount, PAYMENT_METHOD.CHEQUE,7.5)
    }
}

fun makePayment(amount: Int,method: PAYMENT_METHOD,discountPercentage: Double) {
    val discountedPrice = amount * (discountPercentage/100)
    val finalPrice = amount - discountedPrice;
    when(method) {
        PAYMENT_METHOD.CASH -> {
            println("Paying.....🔃  $amount in ${PAYMENT_METHOD.CASH}")
            println("Paid ✅ $finalPrice in ${PAYMENT_METHOD.CASH} with a discount of $discountedPrice")
            println()
        }
        PAYMENT_METHOD.CARD -> {
            println("Paying.....🔃  $amount with ${PAYMENT_METHOD.CARD}")
            println("Paid ✅ $finalPrice with ${PAYMENT_METHOD.CARD}, giving a discount of $discountedPrice")
            println()
        }
        PAYMENT_METHOD.CHEQUE -> {
            println("Paying.....🔃 $amount with ${PAYMENT_METHOD.CHEQUE}")
            println("Paid ✅ $finalPrice with ${PAYMENT_METHOD.CHEQUE}, giving a discount of $discountedPrice")
            println()
        }
        PAYMENT_METHOD.BANK_TRANSFER -> {
            println("Paying.....🔃 $amount with ${PAYMENT_METHOD.BANK_TRANSFER}")
            println("Paid ✅ $finalPrice with ${PAYMENT_METHOD.BANK_TRANSFER}, giving a discount of $discountedPrice")
            println()
        }
    }
}

fun main() {
    initiatePayment(50000, PAYMENT_METHOD.CASH);
    initiatePayment(250000, PAYMENT_METHOD.BANK_TRANSFER);
    initiatePayment(250000, PAYMENT_METHOD.CARD);
    initiatePayment(1250000, PAYMENT_METHOD.CHEQUE);
}
