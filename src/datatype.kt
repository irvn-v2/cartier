fun main() {
    var number: Int = 90 //Int
    var num: Double = 78.01 //Double
    var mydecimal: Float = 67.12F //Float
    var greeting: String = "Hello there"
    var consonant: Char = 'B' //Character
    var isKotlinInteresting: Boolean = true //Boolean

    println(number)
    println(num)
    println(mydecimal)
    println(greeting)
    println(consonant)
    println(isKotlinInteresting)

    //Typecasting
    var x = num.toInt()
    println(x)

    var y = number.toDouble()
    println(y)
}