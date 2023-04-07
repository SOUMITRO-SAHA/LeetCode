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
    private int maxLevel = Integer.MIN_VALUE;
    private int minLevel = Integer.MAX_VALUE;
    
    private void getIndex(TreeNode root, int idx){
        // Base Case:
        if(root == null) 
            return;
        
        // Calculating the Min & Max:
        maxLevel = Math.max(maxLevel, idx);
        minLevel = Math.min(minLevel, idx);
        
        
        // Go to the Next Levels
        // First, Left
        // Second, Right
        getIndex(root.left, idx-1);
        getIndex(root.right, idx+1);
    }
    
    class Pair implements Comparable<Pair> {
        TreeNode node;
        int vLevel;
        
        Pair(TreeNode node, int vLevel){
            this.node = node;
            this.vLevel = vLevel;
        }
        
        @Override
        public int compareTo(Pair other){
            if(this.vLevel == other.vLevel){
                return this.node.val - other.node.val;
            }
            else{
                // this - other gives default behaviour:
                return this.vLevel - other.vLevel;
            }
        }
        
    }
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // Step-1: getting the Index of Left-most and Right-most node, by putting root at
        // 0'th index:
        getIndex(root,0);
        
        int totLevel = maxLevel - minLevel +1;
        
        List<List<Integer>> res = new ArrayList<>();
        
        // Creating an empty 2D List:
        for(int i = 0; i<totLevel; i++){
            res.add(new ArrayList<>());
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        // Adding the root node to the Queue:
        pq.add(new Pair(root, -minLevel));
        
        while(pq.size() > 0){
            // Getting the Size of Queue:
            int size = pq.size();
            PriorityQueue<Pair> temp = new PriorityQueue<>();
            
            while(size-- > 0){
                // Getting the first element that are in the queue:
                Pair rNode = pq.remove();
                
                TreeNode currNode = rNode.node; // Getting the node of Pair:
                int lev = rNode.vLevel; // Getting the Value of Pair:
                
                res.get(lev).add(currNode.val); // Adding those to the approprite indexing:
                
                // Go to the left Sub-Tree:
                if(currNode.left != null){
                    temp.add(new Pair(currNode.left, lev -1));
                }
                
                // Go to the Right Sub-Tree:
                if(currNode.right != null){
                    temp.add(new Pair(currNode.right, lev +1));
                }
            }
            pq = temp;
        }
        
        return res;
    }
}