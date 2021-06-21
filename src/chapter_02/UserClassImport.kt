package chapter_02

import chapter_02.PersonTest as User

fun main() {
    val user = User("유나",24)
    val user2 = Person("2020", "hi")
    println(user.name)
    println(user.age)
    println(user2.id)
    println(user2.name)
}

class Person (val id : String, val name : String)
