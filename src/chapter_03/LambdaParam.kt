package chapter_03

fun main() {

    // 매개변수 없는 경우
    noParam ({ " Hello World ! "})
    noParam ({ " Hello2 World ! "})

    // 매개변수 1개인 경우
    oneParam ({a -> "Hello World $a"})
    oneParam { "Hello World $it"}

    // 매개변수 여러개인 경우
    moreParam { s1, s2 ->
        "Hello World $s1 $s2"
    }

    // 일반 매개변수와 람다식 매개변수 같이 사용하기
    withArgs("Arg1", "Arg2", {a, b -> "Hello World $a $b"})


    // 2개의 람다식을 매개변수로 가진 함수
    twoLambda({a,b -> "First $a $b"}, {"Second $it"})



}

fun noParam (out : () -> String) = println(out())

fun oneParam ( out : (String) -> String) = println(out("OutParam"))

fun moreParam (out : (String, String) -> String) = println(out("One Param", "Two Param"))

fun withArgs (a: String, b : String, out : (String , String) -> String) = println(out(a,b))

fun twoLambda (first : (String, String) -> String , second : (String) -> String) {
    println(first("OneParam","TwoParam"))
    print(second("OneParam"))
}