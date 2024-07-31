class Dog(var name:String, var breed:String, var color:String){

}

fun main() {
    var dog1 = Dog("Denver", "Chiwawa", "White")
    println(dog1.name + " " + dog1.breed)

    var dog2 = Dog("Roxy", "German Shepherd", "Black")
    println(dog2.name + " " + dog2.color)

    var dog3 = Dog("Rocky", "Siberian Husky", "White")
    println(dog3.breed + " " + dog3.color)
}