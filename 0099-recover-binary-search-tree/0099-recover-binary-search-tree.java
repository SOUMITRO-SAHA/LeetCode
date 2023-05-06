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
    private TreeNode first, prev, middle, last;
    private void inorder(TreeNode root){
        if(root == null) return;
        // Going to Left:
        inorder(root.left);
        
        // Root == Main Work Here:
        if(prev != null && (root.val < prev.val)){
            // If it is the first Violation, 
            if(first == null){
                first = prev;
                middle = root;
            }
            
            // For Second, Violation:
            else last = root;
        }
        
        // Going to Right:
        prev = root;
        inorder(root.right);
    }
    public void recoverTree(TreeNode root) {
        prev = new TreeNode(Integer.MIN_VALUE);
        inorder(root);
        if(first != null && last != null){
            int temp = first.val;
            first.val = last.val;
            last.val = temp;
        }
        else if(first != null && middle != null){
            int temp = first.val;
            first.val = middle.val;
            middle.val = temp;
        }
    }
}