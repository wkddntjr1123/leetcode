class Solution {
    var baseIdx = 0
    var maxLen = 0
    
    fun longestPalindrome(s: String): String {
        if (s.length == 1) return s[0].toString()
        for (i in 0 .. s.lastIndex) {
            extend(s, i, i)
            extend(s, i, i+1)
        }
        return s.substring(baseIdx, baseIdx + maxLen)
    }
    
    fun extend(s: String, _i: Int, _j: Int) {
        var (i, j) = _i to _j
        while(i >= 0 && j <= s.lastIndex && s[i] == s[j]) {
            i--
            j++
        }
        if (maxLen < j - i - 1) {
            baseIdx = i + 1
            maxLen = j - i - 1
        }
    }
}