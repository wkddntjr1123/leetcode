class Solution {
    fun letterCombinations(digits: String): List<String> {
        val table = mapOf(
            '2' to "abc", '3' to "def", '4' to "ghi", '5' to "jkl",
            '6' to "mno", '7' to "pqrs", '8' to "tuv", '9' to "wxyz")
        val result = mutableListOf<String>()
        if (digits.isEmpty()) return result else result.add("")
        for ((i, digit) in digits.withIndex()) {
            while(result[0].length != i + 1) {
                val base = result.removeAt(0)
                for(c in table[digit]!!) {
                    result.add(base + c)
                }
            }
        }
        return result
    }
}