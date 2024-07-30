fun main() {
    //Predefined Functions
    println("eMobilis")

    var squareroot = Math.sqrt(49.0)
    println("The square root is $squareroot")

    var round = Math.round(32.87)
    println("The answer is $round")

    var myceil = Math.ceil(45.67)
    println("The answer is $myceil")

    month()
    multiply()
    student("Neema",19)
     student("Makena",22)
}

//User-Defined Functions
fun month (){
    println("The month is July")
}

fun multiply (){
    var num1 = 20
    var num2 = 5
    println(num1 * num2)
}

//Parameter an Arguments
fun student(name:String,age:Int){
    println("My name is $name and I'm $age years old ")
}