class Solution {
    fun duplicateZeros(arr: IntArray): Unit {
        var zeros = arr.count { it == 0 }
        for(i in arr.lastIndex downTo 0){
            if(i + zeros < arr.size) arr[i + zeros] = arr[i]
            if(arr[i] == 0) {
                if(i + --zeros < arr.size) arr[i + zeros] = 0
            }
        }
    }
}