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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preOT(root,res);
        
        return res;
    }
    // TC: O(n);
    // SC: O(n)
    void preOT(TreeNode root, List<Integer> res){
        // Base Case:
        if(root == null) return;
        
        // Adding the root value to the List:
        res.add(root.val);
        
        // Calling the Left Sub Tree:
        preOT(root.left, res);
        // Calling the Right Sub Tree:
        preOT(root.right, res);
    }
}