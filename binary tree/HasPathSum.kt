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
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        // caso base
        if (root == null) {
            return false
        }
    
        val restante = targetSum - root.`val`
        
        if ((root.left == null && root.right == null) && restante == 0) {
            return true
        }
        
        return hasPathSum(root.left, restante) || hasPathSum(root.right, restante)

    }
}