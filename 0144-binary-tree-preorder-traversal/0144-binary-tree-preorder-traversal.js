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
 * @return {number[]}
 */
var preorderTraversal = function(root) {
    const res = [];
    preOrder(root,res);
    return res;
};

let preOrder = (root, res)=>{
    // Base Case:
    if(root == null)
        return;
    // Adding the Root to the array:
    res.push(root.val);
    
    // Calling the Left Sub Tree:
    preOrder(root.left, res);
    
    // Calling the Right Sub Tree:
    preOrder(root.right, res);
};