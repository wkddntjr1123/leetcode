
class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var (tail1, tail2) = Pair(m - 1, n - 1)
        var insertIdx = nums1.lastIndex
        while (tail1 >= 0 && tail2 >= 0){
            nums1[insertIdx--] = if (nums1[tail1] >= nums2[tail2]) 
                nums1[tail1--] else nums2[tail2--]
        }
        while (tail2 >= 0) nums1[insertIdx--] = nums2[tail2--]
    }
}

/*
int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
    while (tail1 >= 0 && tail2 >= 0) {
        nums1[finished--] = (nums1[tail1] > nums2[tail2]) ? 
                             nums1[tail1--] : nums2[tail2--];
    }

    while (tail2 >= 0) { //only need to combine with remaining nums2, if any
        nums1[finished--] = nums2[tail2--];
    }

*/