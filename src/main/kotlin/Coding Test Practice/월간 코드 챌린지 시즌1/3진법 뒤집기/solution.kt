class Solution {
    fun solution(n: Int): Int {
        val ternary = n.toString(3).reversed()

        return ternary.toInt(3)
    }
}