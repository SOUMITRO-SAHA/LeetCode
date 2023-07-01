/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {    
    int sum = 0;
    
    // Main Method:
    public int sumEvenGrandparent(TreeNode root) {
        dfs(root, null, null);
        return sum;
    }
    
    public void dfs(TreeNode root, TreeNode parent, TreeNode gparent) {
        // Base Case:
        if (root == null) return;
        
        // If Even Value Comes:
        if (gparent != null && gparent.val % 2 == 0) {
            sum += root.val; // Add that into the result sum.
        }
        
        // Recursive Call:
        // Left ST:
        if (root.left != null) {
            dfs(root.left, root, parent);
        }
        
        // Right ST:
        if (root.right != null) {
            dfs(root.right, root, parent);
        }
    }
}