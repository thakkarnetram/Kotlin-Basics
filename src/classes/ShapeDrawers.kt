package classes

// Proper example for Abstract Classes
abstract class ShapeDrawer{
    val size : Int = 2
    abstract fun drawLine (x : Int,y :Int,z:Int)
    fun drawSquare(x: Int, y: Int, z: Int) {
        drawLine(x, y, z)
        drawLine(x + y, y + z, z + x + y)
        drawLine(x, z, y)
        println("Square drawn with $x,$y,$z")
    }

    fun drawRectangle(x: Int, y: Int, z: Int) {
        drawLine(x, y, z * size)
        drawLine(x, x, y * size)
        drawLine(x + y, y + z, z + x + y)
        println("Rectangle drawn with $x,$y,$z")
    }
}

class AndroidShapeDrawer : ShapeDrawer() {
    override fun drawLine(x: Int, y: Int, z: Int) {
        println("Android line drawn with $x,$y,$z")
    }
}

class WebsiteShapeDrawer : ShapeDrawer() {
    override fun drawLine(x: Int, y: Int, z: Int) {
        println("Website line drawn with $x,$y,$z")
    }
}

class DesktopShapeDrawer : ShapeDrawer() {
    override fun drawLine(x: Int, y: Int, z: Int) {
        println("Desktop line drawn with $x,$y,$z")
    }
}

fun main() {
    val androidShape = AndroidShapeDrawer()
    androidShape.drawSquare(5,6,2)
    val websiteShape = WebsiteShapeDrawer()
    websiteShape.drawRectangle(6,2,5)
    val desktopShape = DesktopShapeDrawer()
    desktopShape.drawSquare(5,10,15)
}