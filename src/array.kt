fun main() {
    var courses = arrayOf("MIT", "Android", "Data Science")
    println(courses[1])

    //Re-assigning an element in an array
    courses[1] = "Web Development"
    println(courses[1])

    //Looping through an array
    var newcourse = courses.plus("Cyber Security")
    for (course in newcourse){
        println(course)
    }

    //Size of an array
    println(courses.size)
    println(newcourse.size)
}