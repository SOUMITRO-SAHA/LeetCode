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
var inorderTraversal = function(root) {
    const res = [];
    // Calling the helper Function:
    helper(root, res);
    
    // Returning the Array:
    return res;
};

let helper = (root, res) => {
    // Base Case:
    if(root == null)return;
    
    // Recursive Call:
    // First, Left
    helper(root.left, res);
    
    // Second, Adding the Root Value into the Array:
    res.push(root.val);
    
    // Third, Right
    helper(root.right, res);
}