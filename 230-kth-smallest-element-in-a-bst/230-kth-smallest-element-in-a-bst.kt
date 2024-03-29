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
        var indexToFind = k
        
        while(tmp != null || stack.isNotEmpty()){
            while(tmp != null){
                stack.push(tmp)
                tmp = tmp.left
            }
            tmp = stack.pop()
            
            tmp?.let{
                if(--indexToFind == 0) return it.`val`
                tmp = it.right
            }
        }
        
        return -1
        
    }
}