//Parent class/Super class/Base class

open class Animal{
    var gender = "Male"
    var hasfeathers = true

    fun sound(){
        println("Animal is speaking")
    }
}

class Eagle: Animal() {
    var hasscales = true
    var isMammal = true
}

class Ostrich{
    fun movement(){
        println("Ostrich is running")
    }

    fun main() {
        var a = Animal()

        var e = Eagle()

        var o = Ostrich()
    }
}