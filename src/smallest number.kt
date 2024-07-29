import java.util.Scanner

fun main() {
     var read = Scanner(System. `in`)

    println("Enter the first number: ")
    var firstnumber = read.nextInt()

    println("Enter the second number: ")
    var secondnumber = read.nextInt()

    if (firstnumber < secondnumber)
        println("$firstnumber is smaller than $secondnumber")
    else{
        println("$secondnumber is smaller than $firstnumber")
    }
}