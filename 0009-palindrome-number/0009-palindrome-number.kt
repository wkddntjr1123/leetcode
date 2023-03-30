class Solution {
    fun isPalindrome(x: Int): Boolean {
        val str = x.toString()
        return str == str.reversed()
    }
}