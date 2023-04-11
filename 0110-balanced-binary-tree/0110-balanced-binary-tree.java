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
    class Pair{
        int height;
        boolean isBal;
        Pair(){}
        Pair(int ht, boolean bal){this.height = ht; this.isBal = bal;}
    }
    public boolean isBalanced(TreeNode root) {
        Pair res = findBal(root);
        return res.isBal;
    }
    private Pair findBal(TreeNode root){
        // Base Case:
        if(root == null) return new Pair(0, true);
        
        // Recursive Call:
        Pair lc = findBal(root.left);
        Pair rc = findBal(root.right);
        
        Pair mainPair = new Pair();
        
        mainPair.height = Math.max(lc.height, rc.height)+1;
        mainPair.isBal = Math.abs(lc.height - rc.height) <= 1 && lc.isBal && rc.isBal;
        
        return mainPair;
    }
}