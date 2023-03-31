class Solution {
    fun romanToInt(s: String): Int {
        val romanToNum = mapOf('M' to 1000, 'D' to 500, 'C' to 100, 'L' to 50, 'X' to 10, 'V' to 5, 'I' to 1)
        var i = 0
        var result = 0
        while (i < s.length) {
            if(i+1 < s.length && romanToNum.getValue(s[i]) < romanToNum.getValue(s[i+1])) {
                result += romanToNum.getValue(s[i+1]) - romanToNum.getValue(s[i])
                i += 2
                continue
            }
            result += romanToNum.getValue(s[i])
            i += 1
        }
        return result     
    }
}