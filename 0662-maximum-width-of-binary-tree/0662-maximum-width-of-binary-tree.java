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
        int idx;
        TreeNode node;
        Pair(TreeNode node, int idx){
            this.node = node;
            this.idx = idx;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        int max = 0;
        
        q.add(new Pair(root, 0));
        while(!q.isEmpty()){
            int size = q.size();
            int lm = q.peek().idx;
            int rm = q.peek().idx;
            while(size-->0){
                Pair rp = q.poll();
                TreeNode cnode = rp.node;
                rm = rp.idx;
                
                if(cnode.left != null) q.add(new Pair(cnode.left, rp.idx*2 + 1));
                if(cnode.right != null) q.add(new Pair(cnode.right, rp.idx*2 + 2));
            }
            
            // Finding the max:
            max = Math.max(max, rm - lm +1);
        }
        return max;
    }
}