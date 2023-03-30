class Solution {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        val nums = ArrayDeque<Int>()

        tailrec fun dfs(i: Int, target: Int){
            if(target == 0) {
                result.add(nums.toList())
                return
            }
            if(target < 0 || i > candidates.lastIndex) return
            nums.addLast(candidates[i])
            dfs(i, target - candidates[i])
            nums.removeLast()
            dfs(i+1, target)
        }
        dfs(0, target)
        return result
    }
}