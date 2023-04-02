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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inOrd(root,res);
        return res;
    }
    
    void inOrd(TreeNode root, List<Integer> res){
        // Base Case:
        if(root == null) return;
        
        // Recursive Call:
        // First, Left Sub Tree:
        inOrd(root.left, res);
        
        // Second, Printing the Root Node:
        res.add(root.val);
        
        // Third, Right Sub Tree:
        inOrd(root.right, res);
    }
}