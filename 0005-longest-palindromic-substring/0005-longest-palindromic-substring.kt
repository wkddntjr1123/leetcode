class Solution {
    fun longestPalindrome(s: String): String {
        val resultIdx = mutableListOf(-1, -1)
        val canExpand = { i: Int, j: Int ->
            (i-1 >= 0 ) && (j+1 <= s.lastIndex && s[i-1] == s[j+1]) && s[i] == s[j] }
        
        for(i in 0 .. s.lastIndex - 1){
            var (l1, r1) = i to i+1
            while(canExpand(l1, r1)) {
                l1--
                r1++
            }
            var (l2, r2) = i to i
            while(canExpand(l2, r2)) {
                l2--
                r2++
            }
            if (r1 - l1 >= resultIdx[1] - resultIdx[0] && s[r1] == s[l1]) {
                resultIdx[1] = r1
                resultIdx[0] = l1
            }
            if (r2 - l2 > resultIdx[1] - resultIdx[0]) {
                resultIdx[1] = r2
                resultIdx[0] = l2
            }
        }
        return if(resultIdx[0] != -1) s.substring(resultIdx[0], resultIdx[1] + 1) else s[0].toString()
    }
    
}