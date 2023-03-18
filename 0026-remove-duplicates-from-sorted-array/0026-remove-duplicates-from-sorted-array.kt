class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var counter = 0
        for (i in nums.indices) if (nums[i] != nums[counter]) nums[++counter] = nums[i]
        return ++counter
    }
}