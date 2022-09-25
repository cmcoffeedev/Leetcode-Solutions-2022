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
    fun middleNode(head: ListNode?): ListNode? {
        var tmp = head
        var count = 0
        while(tmp != null){
            tmp = tmp?.next
            count++
        }
        var middle = count / 2
        
        tmp = head
        count = 0
        while(count < middle){
            tmp = tmp?.next
            count++
        }
        
        return tmp
    }
}