class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numberMap = mutableMapOf<Int, Int>()
        nums.forEachIndexed { i, num -> 
            val comp = target - num
            if(comp in numberMap) return intArrayOf(numberMap.getValue(comp), i)
            numberMap[num] = i
        }
        return intArrayOf()
    }
}