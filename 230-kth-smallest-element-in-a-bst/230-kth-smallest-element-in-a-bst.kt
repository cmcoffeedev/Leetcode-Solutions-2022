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
        val list = ArrayList<Int>()
        inorder(root, list)
        return list[k-1]
        
    }
    
    fun inorder(root: TreeNode?, list: ArrayList<Int>){
        if(root == null) return 
        
        inorder(root?.left, list)
        list.add(root.`val`)
        inorder(root?.right, list)
    }
}