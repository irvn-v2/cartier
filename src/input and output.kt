import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter Student Name:")
    var name = readln()
    println("The name of the student is $name ")

    println("Enter Course:")
    var course = readln()
    println("$name studies $course ")

    println("Enter Age of the student")
    var age = read.nextInt()
    println("$name's age is $age ")
}