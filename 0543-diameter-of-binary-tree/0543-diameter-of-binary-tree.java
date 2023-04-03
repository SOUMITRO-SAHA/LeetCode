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
    // To solve this Question in O(N): And Without using any Global Variable we are gonna use Pair Class:
    private class Pair{
        int height;
        int diameter;
        
        Pair(int height, int diameter){
            this.height = height;
            this.diameter = diameter;
        }
    }
    private Pair diameter(TreeNode root){
        // Base Case:
        if(root == null) return new Pair(-1,0);
        
        Pair left = diameter(root.left);
        Pair right = diameter(root.right);
        
        int maxHeight = Math.max(left.height, right.height)+1;
        int maxDiameter = Math.max(left.height+right.height+2, Math.max(left.diameter, right.diameter));
        
        return new Pair(maxHeight, maxDiameter);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        // Edge Case:
        if(root == null) return 0;
        Pair ans = diameter(root);
        return ans.diameter;
    }
}