/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        
        val stack = Stack<TreeNode?>()
        
        var tmp = root
        var currentIndex = k
        
        stack.push(root)
        while(stack.isNotEmpty() || tmp != null){
            while(tmp != null){
                stack.push(tmp)
                tmp = tmp?.left
            }
            
            tmp = stack.pop()
            tmp?.let{
                if(--currentIndex == 0) return it.`val`
            }
            tmp = tmp?.right
        }
        
        return -1
        
    }
  
}