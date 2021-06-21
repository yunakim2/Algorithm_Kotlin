package chapter_03


fun main() {
    val result = callByName(otherLambda)
    println(result)
}

fun callByName(b : () ->  Boolean) : Boolean {
    println("callByName Function")
    return b()
}

val otherLambda  : () -> Boolean = {
    println("otherLambda Function")
    true
}