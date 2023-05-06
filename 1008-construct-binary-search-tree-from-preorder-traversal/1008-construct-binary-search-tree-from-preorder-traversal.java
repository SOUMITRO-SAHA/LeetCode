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
    private int idx = 0;
    private TreeNode construct(int []pre, int l, int r){
        // Base Case:
        if(idx == pre.length) return null;
        if(pre[idx] < l || pre[idx] > r) return null;
        
        // Recursive Call:
        // Creating Node:
        TreeNode node = new TreeNode(pre[idx]);
        idx++;
        // go to left:
        node.left = construct(pre, l, node.val -1);
        // go to right:
        node.right = construct(pre, node.val+1, r);
        
        return node;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return construct(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}