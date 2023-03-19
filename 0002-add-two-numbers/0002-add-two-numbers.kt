/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var resultHead = ListNode(0)
        var curNode = resultHead
        var (h1, h2) = Pair(l1, l2)
        var carry = 0
        while(h1 != null || h2 != null || carry != 0){
            val sum = (h1?.`val` ?: 0) + (h2?.`val` ?: 0) + carry
            carry = sum / 10
            curNode.next = ListNode(sum % 10)
            curNode = curNode.next
            if(h1 != null) h1 = h1.next
            if(h2 != null) h2 = h2.next
        }
        return resultHead.next
    }
}