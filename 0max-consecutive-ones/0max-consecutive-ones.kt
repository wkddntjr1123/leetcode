import kotlin.math.max

class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        return nums.joinToString("").split("0").maxBy {it.length}!!.length
    }
}