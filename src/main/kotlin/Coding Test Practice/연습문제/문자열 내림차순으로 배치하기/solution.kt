class Solution {
    fun solution(s: String): String {
        var answer = ""
        s.toCharArray().sortedDescending().forEach {
            answer += it
        }
        return answer
    }
}