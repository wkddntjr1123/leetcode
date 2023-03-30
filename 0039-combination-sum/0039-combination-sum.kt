class Solution {
    private val result = mutableListOf<List<Int>>()

    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        dfs(candidates, target, 0, 0, ArrayDeque())
        print(result)
        return result
    }

    fun dfs(candidates: IntArray, target: Int, index: Int, sumValue: Int, nums:Deque<Int>) {
        if(sumValue >= target) {
            if(sumValue == target) {
                result.add(nums.toList())
            }
            return
        }
        for(i in index..candidates.lastIndex){
            nums.addLast(candidates[i])
            dfs(candidates, target, i, sumValue + candidates[i], nums)
            nums.removeLast()
        }
    }
}