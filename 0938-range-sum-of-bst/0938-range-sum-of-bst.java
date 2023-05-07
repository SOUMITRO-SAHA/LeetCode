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
    // Brute-Force:
	// DFS Traversal:
	// Post-Order Traversal:
	// TC: O(n), SC: O(1)
	private int currSum = 0;
	private void dfs(TreeNode root, int l, int r){
		// Base Case:
		if(root == null) return;
		// if(root.data < l || root.data > r) return 0;

		// Recursive Call:
		// Go Left: 
		dfs(root.left, l, r);
		
		// Go Right:
		dfs(root.right, l, r);

		// Checking for range and Add up to the Answer:
		
		if(root.val >= l && root.val <= r) currSum += root.val;
	}
    public int rangeSumBST(TreeNode root, int low, int high) {
        dfs(root, low, high);
        return currSum;
    }
}