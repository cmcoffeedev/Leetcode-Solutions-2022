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
    fun reverseList(head: ListNode?): ListNode? {
        var prev : ListNode? = null
        return reverse(prev, head)
        //return reverseTwo(head)
    }
    
    fun reverseTwo(head: ListNode?): ListNode?{
        var prev: ListNode? = null

        if (head==null || head.next == null)
            return head
        
        var current = head

        prev = reverseTwo(current.next)
        current.next.next = current
        current.next = null

        return prev; 
    }
    
    fun reverse(prev: ListNode?, head: ListNode?): ListNode?{
        
        var previous = prev
        var tmp = head 
        val next = tmp?.next
        tmp?.next = previous
        
        
        if(next == null) return tmp
        
        if(next?.next == null){
            next?.next = tmp 
            return next
        } 
        
        return reverse(tmp, next)
        
    }
}