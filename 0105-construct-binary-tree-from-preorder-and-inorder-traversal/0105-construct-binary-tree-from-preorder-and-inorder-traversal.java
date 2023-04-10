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
    private TreeNode construct(int[] pre, int sPre, int ePre, int[] in, int sIn, int eIn){
        // Base Case:
        if(sPre > ePre || sIn > eIn) return null;
        
        // preorder = [3,9,20,15,7] {Root, Left, Right}
        // inorder  = [9,3,15,20,7] {Left+Root+Right}
        TreeNode root = new TreeNode(pre[sPre]); // The 1st Element of Preorder[] is always be root node:
        
        int i = sIn; // The count of 'i' will allways starts form starting index of inorder[].
        int c = 0;
        while(root.val != in[i]){
            i++;
            c++; // This will count the element before root node in Inorder[].
        }
        
        // Recursive Call:
        root.left = construct(pre,sPre+1,sPre+c,in,sIn,i-1);
        root.right = construct(pre,sPre+c+1,ePre,in,i+1, eIn);
        
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return construct(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }
}