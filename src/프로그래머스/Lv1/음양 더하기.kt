package 프로그래머스.Lv1

class AbsolutesNumberSolution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0
        for (i in signs.indices) {
            if (signs[i]) answer += absolutes[i]
            else answer -= absolutes[i]
        }

        return answer
    }
}

fun main() {
    println(AbsolutesNumberSolution().solution(intArrayOf(4,7,12), booleanArrayOf(true, false, true)))
}