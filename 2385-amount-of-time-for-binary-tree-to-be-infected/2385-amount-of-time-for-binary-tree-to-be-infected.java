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
    private void setParent(TreeNode root, HashMap<TreeNode, TreeNode> parent){
        // Base Case:
        if(root == null) return;
        
        // Setting the Child-> Parent:
        if(root.left != null) parent.put(root.left, root);
        if(root.right != null) parent.put(root.right, root);
        
        // Recursive Call:
        setParent(root.left, parent);
        setParent(root.right, parent);
    }
    private TreeNode find(TreeNode root, int target){
        // Base Case:
        if(root == null || root.val == target) 
            return root;
        
        // Recursive Call:
        TreeNode filc = find(root.left, target);
        if(filc != null) return filc;
        
        TreeNode firc = find(root.right, target);
        if(firc != null) return firc;
        
        return null;
    }
    public int amountOfTime(TreeNode root, int start) {
        // Task-1: We have to maintain a HashTable for each child -> Parent:
        HashMap<TreeNode, TreeNode> parent = new HashMap<>();
        setParent(root, parent);
        
        // Getting the src node:
        TreeNode src = find(root, start);
        
        // Maintaining a Queue:
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(src);
        
        // Maintaining a HS for visiting Node:
        HashSet<TreeNode> vis = new HashSet<>();
        vis.add(src);
        
        // Maintaining the Level:
        int level = 0;
        while(q.size() != 0){
            int size = q.size();
            while(size-->0){
                TreeNode rnode = q.poll();
                
                // Case-1: For Left Child
                if(rnode.left != null && !vis.contains(rnode.left)){
                    q.add(rnode.left);
                    vis.add(rnode.left);
                }
                // Case-2: For Right Child
                if(rnode.right != null && !vis.contains(rnode.right)){
                    q.add(rnode.right);
                    vis.add(rnode.right);
                }
                // Case-3: For Parent
                if(parent.containsKey(rnode)&& !vis.contains(parent.get(rnode))){
                    q.add(parent.get(rnode));
                    vis.add(parent.get(rnode));
                }
            }
            level++;
        }
        
        // Returning the Result:
        return level -1;
    }
}