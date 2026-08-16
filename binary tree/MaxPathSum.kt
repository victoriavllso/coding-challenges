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
    fun maxPathSum(root: TreeNode?): Int {
        var bestPath = Int.MIN_VALUE

        fun dfs(node: TreeNode?): Int {
            if (node == null) {
                return 0
            }

            val left = maxOf(0, dfs(node.left))
            val right = maxOf(0, dfs(node.right))

            val currentPath = node.`val` + left + right

            bestPath = maxOf(bestPath, currentPath)

            // to father, just choose one side
            return node.`val` + maxOf(left, right)
        }

        dfs(root)

        return bestPath
    }
}