class Solution {
    fun minPartitions(n: String): Int {
        return n.maxBy { it }!! - '0'
    }
}