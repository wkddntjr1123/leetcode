class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        val answer = IntArray(nums.size)
        var (l, r, idx) = Triple(0, nums.lastIndex, nums.lastIndex)
        while(l <= r){
            val ls = nums[l] * nums[l]
            val rs = nums[r] * nums[r]
            if(ls > rs) {
                answer[idx--] = ls
                l++
            } else{
                answer[idx--] = rs
                r--
            }
        }
        return answer
    }
}