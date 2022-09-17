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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val dummy = ListNode(-1)
        var curr = dummy
        var listOne = list1
        var listTwo = list2
        while(listOne != null && listTwo != null){
            if(listOne.`val` < listTwo.`val`){
                curr.next = ListNode(listOne.`val`)
                listOne = listOne.next
                curr = curr.next
            }
            else{
                curr.next = ListNode(listTwo.`val`)
                listTwo = listTwo.next
                curr = curr.next
            }
        }
        
        while(listOne != null) {
            curr.next = ListNode(listOne.`val`)
            listOne = listOne.next
            curr = curr.next
        }
        
        while(listTwo != null) {
            curr.next = ListNode(listTwo.`val`)
            listTwo = listTwo.next
            curr = curr.next
        }
        
        return dummy.next
    }
}