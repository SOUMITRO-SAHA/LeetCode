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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        // Edge Case 
        if(root == null) return null;
        
        // To trim BSt => Recursive Approach:
        
        // Contion to be in the range:
        if(root.val < low){
            // I have to go to right:
            return trimBST(root.right, low, high);
        }
        if(root.val > high){
            // I have to go to Left:
            return trimBST(root.left, low, high);
        }
        
        
        // Left and Right =>
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        
        // Return
        return root;
        
    }
}