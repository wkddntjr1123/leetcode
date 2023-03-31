class Solution {
    fun isValid(s: String): Boolean {
        val validPair = mapOf( ')' to '(', '}' to '{', ']' to '[' )
        val stack = ArrayDeque<Char>()
        for(c in s){
            if(c in validPair) {
                if (stack.isEmpty() || stack.removeLast() != validPair[c]) return false
            } else {
                stack.addLast(c)
            }
        }
        return stack.isEmpty()
    }
}