class Solution {
    fun strStr(haystack: String, needle: String): Int {
        for (i in 0..haystack.length - needle.length) {
            for (j in 0..needle.length - 1) {
                if (needle[j] != haystack[i + j]) break
                if (j == needle.length -1) return i
            }
        }
        return -1
    }
}