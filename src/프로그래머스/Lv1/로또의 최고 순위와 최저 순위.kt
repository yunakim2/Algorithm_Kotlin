package 프로그래머스.Lv1

class LottoMinMaxSolution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var checkZero = 0
        var checkWin = 0

        for (lotto in lottos) {
            if (lotto in win_nums) {
                checkWin += 1
            }
            if (lotto == 0) {
                checkZero += 1
            }
        }

        val max = when(checkWin+ checkZero) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }

        val min = when(checkWin) {
            6 -> 1
            5 -> 2
            4 -> 3
            3 -> 4
            2 -> 5
            else -> 6
        }



        return intArrayOf(max, min)

    }
}

fun main() {
    println(LottoMinMaxSolution().solution(lottos = intArrayOf(44,1,0,0,31,25), win_nums = intArrayOf(31,10,45,1,6,19)).contentToString())
}