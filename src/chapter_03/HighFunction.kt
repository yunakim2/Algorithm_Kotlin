package chapter_03

fun main() {

    val res1 = sum(3,2) // 일반 인자
    val res2 = mul(sum(3,3), 3)  // 인자에 함수를 사용
    println("res1 $res1, res2 $res2")
    println("funcFunc ${funcFunc()}")

    val multi = {x : Int, y : Int -> x * y}
    val  result = multi(10,20)
    println("result $result")

    val greet : () -> Unit = { println("Hello World") }
    val square : (Int) -> Int = {x -> x *x}

    println("greet ${greet()}")
    greet()
    println("square : ${square(3)}")

    val nestedLambda : () -> () -> Unit = {{ println("Hello World") }}

    val greet2 = { println("Hello World") } // 추론 가능
    val square2 = { x : Int -> x*x }  // x의 자료형 명시해야함!

    val out : () -> Unit = {println("out!!")}
    out()
    val new = out
    new()


}

fun sum (a : Int, b : Int) = a + b
fun mul (a : Int, b : Int) = a * b

fun funcFunc() : Int = sum(2,2)




