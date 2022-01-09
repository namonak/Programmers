class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = -1

        answer = (0..9).sum() - numbers.sum()

        return answer
    }
}