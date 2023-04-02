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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }
    
    void helper(TreeNode root, List<Integer> res){
        // Base Case:
        if(root == null) return;
        
        // First, Left Sub Tree:
        helper(root.left, res);
        // Second, Right Sub Tree:
        helper(root.right, res);
        // Third, Putting the Root value to the List:
        res.add(root.val);
    }
}