//Determining whether a letter is a vowel or a consonant

fun checkLetter(letter: Char): String {
    // Convert the letter to lowercase for consistency
    val lowerLetter = letter.lowercase()

    // Check if the letter is a vowel
    return when (lowerLetter) {
        "a", "e", "i", "o", "u" -> "vowel"
        in "a".."z" -> "consonant"
        else -> "not a letter"
    }
}

fun main() {
    print("Enter a letter: ")
    val input = readLine() ?: ""

    // Check if the input is a single character
    if (input.length == 1) {
        val letter = input[0]
        val result = checkLetter(letter)
        println("The letter '$letter' is a $result.")
    } else {
        println("Please enter a single letter.")
    }
}