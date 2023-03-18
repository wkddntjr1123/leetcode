import kotlin.math.max

class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var count = 0
        var answer = 0
        for(num in nums){
            if(num == 1) count++
            else {
                answer = max(answer, count)
                count = 0
            }
        }
        answer = max(answer, count)
        return answer
    }
}