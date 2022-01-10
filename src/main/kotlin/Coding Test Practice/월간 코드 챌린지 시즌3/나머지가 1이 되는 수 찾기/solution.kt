class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0

        do {
            answer++
        } while (n % answer != 1)

        return answer
    }
}