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
    // Morris Traversal:
    // TC: O(N) => (As each node will only visit 3 Time .) => O(3 * N) ~ O(N)
    public List<Integer> preorderTraversal(TreeNode root) {
        TreeNode curr = root;
        List<Integer> pre = new ArrayList<>();
        
        while(curr != null){
            if(curr.left == null){
                // Special condition
                pre.add(curr.val);
                // If It was in-order then add here.
                curr = curr.right;
            }
            else {
                // I have to detect if I am begin visited for the first time or second time
                // If link is not present => Then First Time
                // Else Second Time.
                // I have to detect whether there is a link or not
                TreeNode rmn = curr.left;
                while(rmn.right != null && rmn.right != curr){
                    rmn = rmn.right;
                }
                
                // if the rmn.right == curr, link was there
                if(rmn.right == curr){
                    // Second time as link was there
                    // If It was in-order then add here.
                    rmn.right = null; // demolishing the link
                    curr = curr.right; // going to the right subtree
                }
                // Link wasn't there
                else{
                    // If link was not there, then establish a link
                    pre.add(curr.val); // preorder work
                    rmn.right = curr; //establishing the link
                    curr = curr.left; // going to the left subtree
                }
            }
        }
        
        return pre;
    }
}