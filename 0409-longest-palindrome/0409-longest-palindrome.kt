class Solution {
    fun longestPalindrome(s: String): Int {
        val counterMap = s.groupingBy { it }.eachCount()
        val counts = s.groupingBy { it }
            .eachCount().values
        return counts.fold(0) { acc, v -> if (v % 2 == 0) acc + v else acc + v - 1 } + 
            if (counts.any { it % 2 == 1 }) 1 else 0
    }
}
