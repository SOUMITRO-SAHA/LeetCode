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
    public TreeNode searchBST(TreeNode root, int val) {
        // Base Case:
        if(root == null) 
            return null;
        
        // Checking if the root node is the target Node:
        if(root.val == val) return root;
        
        // Search in the Left Sub-Tree:
        TreeNode lTree = searchBST(root.left, val);
        if(lTree != null && lTree.val == val) return lTree;
        
        // Searching in the Right Sub-Tree:
        TreeNode rTree = searchBST(root.right, val);
        if(rTree != null && rTree.val == val) return rTree;
        
        // Other wise:
        return null;
    }
}