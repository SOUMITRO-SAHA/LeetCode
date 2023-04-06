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
    // This the BFS Algorithm: [Breath First Search]
    // Most Important Algorithm
    public List<List<Integer>> levelOrder(TreeNode root) {
        // Edge Case:
        if(root == null){
            return new ArrayList<>();
        }
        // First, Creating a Queue to Store the Queue Answer:
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        // Adding the Root node into the Queue:
        q.add(root);
        // When the Size of the Queue Will become zero then it will stop:
        while(q.size() > 0){
            // Getting the size of the Queue:
            int size = q.size();
            List<Integer> currList = new ArrayList<>();
            // It will run till the size become 0
            while(size-- > 0){
                // Getting the Top Node in the Queue:
                TreeNode rnode = q.remove();
                currList.add(rnode.val);
                // If the Current node has any Left node then add it to the Queue:
                if(rnode.left != null){
                    q.add(rnode.left);
                }
                // If the Current node has any Right node then add it to the Queue:
                if(rnode.right != null){
                    q.add(rnode.right);
                }
            }
            ans.add(currList);
        }
        return ans;
    }
}