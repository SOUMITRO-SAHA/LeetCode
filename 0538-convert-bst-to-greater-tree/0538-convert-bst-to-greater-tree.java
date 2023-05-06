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
    private int sum = 0;
    private void dfs(TreeNode root){
        // Base Case:
        if(root == null) return;
        
        // Recursive Call:
        // First, Right:
        dfs(root.right);
        
        // Second, Work:
        int temp = root.val;
        root.val += sum;
        sum += temp;
        
        // Third, Left:
        dfs(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        // Calling DFS
        dfs(root);
        return root;
    }
}