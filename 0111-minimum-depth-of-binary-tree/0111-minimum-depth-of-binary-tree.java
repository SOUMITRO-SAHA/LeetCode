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
    public int minDepth(TreeNode root) {
        // Base Case:
        if(root == null)
            return 0;
        
        int mLeft = minDepth(root.left);
        int mRight = minDepth(root.right);

        return (mLeft == 0 || mRight == 0)? mLeft+mRight+1 : Math.min(mLeft, mRight)+1;
    }
}