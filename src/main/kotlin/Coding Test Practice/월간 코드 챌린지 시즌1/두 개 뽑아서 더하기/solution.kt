package `Coding Test Practice`.`월간 코드 챌린지 시즌1`.`두 개 뽑아서 더하기`

class Solution {
    fun solution(numbers: IntArray): IntArray {
        val answer = mutableListOf<Int>()

        for (i in numbers.indices) {
            for (j in i + 1 until numbers.size) {
                if (!answer.contains(numbers[i] + numbers[j])) {
                    answer.add(numbers[i] + numbers[j])
                }
            }
        }

        return answer.toSortedSet().toIntArray()
    }
}