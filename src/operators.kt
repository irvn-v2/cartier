fun main() {
    //Arithmetic Operators
    var x = 90
    var y = 5

    println(x + y)
    println(x - y)
    println(x * y)
    println(x / y)
    println(x % y) //Modulus

    //Comparison Operators
    var num1 = 45
    var num2 = 30

    println(num1 < num2)
    println(num1 > num2)
    println(num1 <= num2)
    println(num1 >= num2)
    println(num1 == num2)
    println(num1 != num2)

    //Assignment operators
    var number = 10
    println(number)

    number += 2
    println(number)

    number -= 3
    println(number)

    number *= 4
    println(number)

    number /= 5
    println(number)

    number %= 4
    println(number)

    //Logic Operators - &&, ||, !
    println( (100 > 20) && (80 < 10) ) //and
    println( (100 > 20) || (80 < 10) ) //or
    println( !((100 > 20) && (80 < 10))) //not
}