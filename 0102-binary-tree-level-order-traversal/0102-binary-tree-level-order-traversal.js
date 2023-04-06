/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[][]}
 */
var levelOrder = function(root) {
    // Edge Case:
    if(!root) return [];
    
    // Creating ans array:
    const ans = [];
    // Setting a Queue DS using an array:
    // To add element = push()
    // To remove element = shift()
    const que = [];
    
    // Putting the root node into the Queue:
    que.push(root);
    
    while(que.length > 0){
        let size = que.length;
        let temp = [];
        while(size-- > 0){
            const rnode = que.shift();
            temp.push(rnode.val);
            if(rnode.left) que.push(rnode.left);
            if(rnode.right) que.push(rnode.right);
        }
        ans.push(temp);
    }
    
    return ans;
};