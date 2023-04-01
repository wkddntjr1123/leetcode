class Solution {
    fun letterCombinations(digits: String): List<String> {
        val table = mapOf(
            '2' to "abc", '3' to "def", '4' to "ghi", '5' to "jkl",
            '6' to "mno", '7' to "pqrs", '8' to "tuv", '9' to "wxyz")
        val result = mutableListOf<String>()
        
        tailrec fun dfs(level: Int, cand: String) {
            if(level > digits.length - 1) {
                result.add(cand)
                return
            }
            for(c in table[digits[level]]!!) {
                dfs(level + 1, cand + c)            
            }
        }
        if(digits.length != 0) dfs(0, "")
        return result
    }
}