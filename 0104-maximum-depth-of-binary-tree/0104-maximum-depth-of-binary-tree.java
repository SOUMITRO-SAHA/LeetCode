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
    public int maxDepth(TreeNode root) {
        // Base Case:
        if(root == null) return 0;
        else{
            int mDLeft = maxDepth(root.left);
            int mDRight = maxDepth(root.right);
            return mDLeft > mDRight? mDLeft+1 : mDRight+1;
        }
    }
}