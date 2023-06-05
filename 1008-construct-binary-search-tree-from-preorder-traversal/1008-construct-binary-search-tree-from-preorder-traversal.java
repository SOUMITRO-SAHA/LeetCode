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
    public TreeNode bstFromPreorder(int[] preorder) {
        return construct(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
        
    }
    TreeNode construct(int []pre, int l, int r){
        // Base Case:
        if(idx == pre.length) return null;
        if(pre[idx] < l || pre[idx] > r) return null;
        
        // Creating the Root:
        TreeNode root = new TreeNode(pre[idx++]);
        
        // Left Sub-Tree:
        root.left = construct(pre, l, root.val - 1);
        // Right Sub-Tree:
        root.right = construct(pre, root.val+1, r);
        
        return root;
    }
}