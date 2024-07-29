fun main() {
    //While
    var number = 200
    while (number <= 205){
        println("Number is $number")
        number++
    }

    var x = 200
    while (x >= 195){
        println(x)
        x--
    }

    //Break
    var num = 1
    while (num <= 5) {
        println(num)
        num++

        if (num == 4)
            break
    }

    //Continue
    var count = 10
    while (count <= 15){
        if (count == 14){
            count++
            continue
        }
        println(count)
        count++
    }



}