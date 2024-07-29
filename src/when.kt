fun main() {
    var marks = 80

    var grade = when(marks){
        80 -> 'A'
        70 -> 'B'
        60 -> 'C'
        50 -> 'D'
        else -> "E"
    }
    println("Student scored $grade")
}