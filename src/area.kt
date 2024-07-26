import java.util.Scanner

//Area of a rectangle = (L * W)
fun main() {
       var read = Scanner(System.`in`)

    println("Enter length of the rectangle: ")
    var length = read.nextInt()

    println("Enter width of the rectangle:" )
    var width = read.nextInt()

    println("The area of the rectangle is " + width * length)
}
