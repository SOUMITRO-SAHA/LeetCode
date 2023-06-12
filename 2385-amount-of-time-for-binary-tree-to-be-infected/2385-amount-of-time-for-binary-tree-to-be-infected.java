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
    public int amountOfTime(TreeNode root, int start) {
        // First, I have to form a map , which will store the addres of parent with it's child
        Map<TreeNode, TreeNode> map = new HashMap<>();
        TreeNode []snode = new TreeNode[1];
        
        // BFS Algorith to form the map and find the target node:
        childToParent(root, snode, start,  map);
        
        // Now, I have to find the target node:
        
        // Now, I have to Traverse levelwise:
        int lvl = 0;
        Queue<TreeNode> q = new LinkedList<>();
        // Adding the target node to the queue
        q.add(snode[0]);
        
        // Maintaining a visited nodes Set
        Set<TreeNode> vis = new HashSet<>();
        // Adding the target node to the set:
        vis.add(snode[0]);
        
        while(q.size() > 0){
            // Size:
            int size = q.size();
            // Visit it's childrens:
            while(size-->0){
                // Front
                TreeNode node = q.poll();
                if(node.left != null  && !vis.contains(node.left)){
                    q.add(node.left);
                    vis.add(node.left);
                } 
                if(node.right != null  && !vis.contains(node.right)){
                    q.add(node.right);
                    vis.add(node.right);
                } 
                if(map.containsKey(node) && !vis.contains(map.get(node))) {
                    q.add(map.get(node));
                    vis.add(map.get(node));
                }
            }
            
            // Work
            lvl++;
        }
        
        return lvl -1;
    }
    private void childToParent (TreeNode root, TreeNode []snode, 
                                int target, Map<TreeNode, TreeNode> map){
        Queue<TreeNode> q = new LinkedList<>();
        // Adding the root node:
        q.add(root);
        
        while(q.size() > 0){
            // Front
            TreeNode node = q.poll();
            
            // work
            if(node.val == target) snode[0] = node;
            // Go to it's childs
            if(node.left != null){
                map.put(node.left, node);
                q.add(node.left);
            }
            if(node.right != null){
                map.put(node.right, node);
                q.add(node.right);
            }
        }
    }
    
}