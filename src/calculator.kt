import java.util.Scanner

fun main() {
    var read = Scanner(System. `in`)

     println("Enter first number: ")
     var num1 = read.nextDouble()

     println("Enter Second number: ")
     var num2 = read.nextDouble()

    println("Enter operation (+, -, *, /): ")
    var operation = read.next()[0]

    var result = when (operation){
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> if (num2 != 0.0) num1 / num2 else Double.NaN
        else -> {
            println("Invalid operation")
            return
        }
    }
    println("The answer is $result ")
}