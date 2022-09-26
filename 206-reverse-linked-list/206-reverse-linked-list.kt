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
        if(head == null) return head
        
        val stack = Stack<ListNode?>()
        
        var current = head
        
        while(current != null){
            stack.push(current)
            current = current?.next
        }
        
        var dummy = ListNode(-1)
        var tmp: ListNode? = dummy
        
        while(stack.isNotEmpty()){
            tmp?.next = stack.pop()
            tmp = tmp?.next
        }
        tmp?.next = null
        
        return dummy.next
        
    }
    
   
}