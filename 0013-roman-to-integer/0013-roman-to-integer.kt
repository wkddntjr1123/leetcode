class Solution {
    fun romanToInt(s: String): Int {
        val romanToNum = mapOf('M' to 1000, 'D' to 500, 'C' to 100, 'L' to 50, 'X' to 10, 'V' to 5, 'I' to 1)
        var result = 0
        for(i in s.length-1 downTo 0){
            val cur = romanToNum.getValue(s[i])
            if(i != s.length-1 && cur < romanToNum.getValue(s[i+1])) result -= cur
            else result += cur
        }
        return result
    }
}