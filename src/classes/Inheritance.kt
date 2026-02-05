package classes


open class Vehicle (
    open var vehicleName : String = "",
    open var vehiclePrice : String = "",
    open var vehicleEngine : String = "",
) {
    fun vehicleDetails(){
        println("Vehicle $vehicleName costs Rs $vehiclePrice/- and has $vehicleEngine CC engine")
    }
}

class Car : Vehicle ()  {
    fun setDetails(){
        vehicleName = "BMW M5"
        vehiclePrice = "1,00,00,000"
        vehicleEngine = "4500"
    }
}

class Bike : Vehicle () {
    fun setDetails(){
        vehicleName = "GT 650"
        vehiclePrice = "4,50,000"
        vehicleEngine = "650"
    }
}

fun main () {
    val car = Car()
    val bike = Bike()
    car.setDetails()
    bike.setDetails()
    car.vehicleDetails()
    bike.vehicleDetails()
}