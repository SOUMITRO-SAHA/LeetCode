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
var postorderTraversal = function(root) {
    const res = [];
    fun(root, res);
    return res;
};

function fun(root, res){
    // Base Case:
    if(root == null) return;
    
    // First, Left Tree:
    fun(root.left, res);
    // Second, right Tree:
    fun(root.right, res);
    // Third, Root
    res.push(root.val);
}