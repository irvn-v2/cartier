fun main() {
    for (number in 20..25){
        println("Number: $number")
    }

    for (letter in 'b'..'f'){
        println("Letter: $letter")
    }

    for (num in 100..104){
        if (num == 103){
            break
        }
        println(num)
    }

    for (myletter in 'a'..'d'){
        if (myletter == 'b'){
            continue
        }
        println(myletter)
    }
}