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
    public TreeNode deleteNode(TreeNode root, int key) {
        // Base Case:
        if(root == null) return null;
        // When We found the Key:
        if(root.val == key){
            
            // Leaf Node:
            if(root.left == null && root.right == null && root.val == key) return null;

            // Only Having Left Child:
            else if(root.right == null && root.left != null && root.val == key) return root.left;
            // Only Having Right Child:
            else if(root.right != null && root.left == null && root.val == key) return root.right;

            // Having Both Child:
            else{
                // Find the Right Min Element:
                int minR = min(root.right);

                // Replace the target Node value with min value:
                root.val = minR;

                // Deleting the min:
                root.right = deleteNode(root.right, minR);
            }
            
            return root;
        }
        else if(key < root.val){
            // Go Left:
            root.left = deleteNode(root.left, key);
        }
        else {
            // Go Right:
            root.right = deleteNode(root.right, key);
        }
        
        return root;
    }
    
    private int min(TreeNode root){
			// Base Case + Recursive Call:
			return (root.left == null)? root.val : min(root.left);
		}
}