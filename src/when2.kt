import java.util.Scanner

fun main() {
    var read = Scanner(System. `in`)

    println("Enter year of study: ")
    var year = read.nextInt()

    var output = when(year){
        1 -> "First year student"
        2 -> "Second year student"
        3 -> "Third year student"
        4 -> "Fourth year student"
        else -> "Invalid year"
    }
    println("I am a $output")
}