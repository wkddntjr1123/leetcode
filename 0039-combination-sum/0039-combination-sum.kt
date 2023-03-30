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
            for(j in i..candidates.lastIndex){
                nums.addLast(candidates[j])
                dfs(j, target - candidates[j])
                nums.removeLast()
            }
        }
        dfs(0, target)
        return result
    }
}