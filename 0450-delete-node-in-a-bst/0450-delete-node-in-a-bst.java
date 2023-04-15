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
    private int min(TreeNode root){
        TreeNode temp = root;
        while(temp.left != null) temp = temp.left;
        return temp.val;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        // Base case:
        if(root == null) return null;
        
        // Recursive Call:
        // First, We have to find the Position:
        if(root.val == key){
            // Leaf Node:
            if(root.left == null && root.right == null)return null;
            // Only left Child:
            else if(root.left != null && root.right == null) return root.left;
            // Only having Right Child:
            else if(root.right != null && root.left == null) return root.right;

            // Having both the Child:
            else{
                // In this case I am gonna find the min element form right child:
                int minEl = min(root.right);
                root.val = minEl;
                // Now, Delete the Duplicate Node form right child:
                root.right = deleteNode(root.right, minEl);
                return root;
            }
            
        }
        else if(root.val < key) root.right = deleteNode(root.right, key);
        else root.left = deleteNode(root.left, key);
        
        return root;
    }
}