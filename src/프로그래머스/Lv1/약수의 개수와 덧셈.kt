package 프로그래머스.Lv1

class DivisorCheckSolution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0

        for (i in left .. right) {
            if(checkDivisor(i))  {
                answer += i
            } else {
                answer -= i
            }
        }

        return answer
    }

    fun checkDivisor(i : Int) : Boolean {

        if(i == 1) return false
        var cnt = 0
        for (j in 1 .. i) {
            if (i%j == 0) cnt += 1
        }

        return cnt % 2 == 0
    }
}

fun main() {
    val solution = DivisorCheckSolution()
    println(solution.solution(13,17))
}