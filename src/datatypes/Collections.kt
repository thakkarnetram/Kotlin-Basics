package datatypes

fun main() {
    val listOfProducts = listOf<Any>(
        "Mobiles",
        "Laptops",
        "Desktops",
    )
    println("List of available products $listOfProducts")
    println("Size of available products ${listOfProducts.size}")
    for (products in listOfProducts) {
        println(products)
    }
    val modifiedList = listOfProducts - "Desktops" + "Gaming PC"
    println(modifiedList)
}