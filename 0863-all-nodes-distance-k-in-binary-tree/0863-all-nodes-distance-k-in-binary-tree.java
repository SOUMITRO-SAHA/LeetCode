/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
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
    private TreeNode find(TreeNode root, TreeNode target){
        // Base Case:
        if(root == null || root == target) 
            return root;
        
        // Recursive Call:
        TreeNode filc = find(root.left, target);
        if(filc != null) return filc;
        
        TreeNode firc = find(root.right, target);
        if(firc != null) return firc;
        
        return null;
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        // Task-1: We have to maintain a HashTable for each child -> Parent:
        HashMap<TreeNode, TreeNode> parent = new HashMap<>();
        setParent(root, parent);
        
        // Getting the src node:
        TreeNode src = find(root, target);
        
        // A List to getting the Ans:
        List<Integer> ans = new ArrayList<>();
        
        // Edge Case:
        if(k == 0 && src != null){
            ans.add(src.val);
            return ans;
        }
        
        // Maintaining a Queue:
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(src);
        
        // Maintaining a HS for visiting Node:
        HashSet<TreeNode> vis = new HashSet<>();
        vis.add(src);
        
        
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
            
            // if level == k
            if(level == k){
                while(q.size() != 0)
                    ans.add(q.poll().val);
            }
        }
        
        // Returning the Result:
        return ans;
    }
}