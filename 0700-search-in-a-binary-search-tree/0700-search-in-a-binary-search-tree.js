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
 * @param {number} val
 * @return {TreeNode}
 */
var searchBST = function(root, val) {
    // Base Case:
    if(!root || root.val == val) 
        return root;
    
    // Recursive Call:
    // Searching in the Left Tree:
    let lTree = searchBST(root.left, val);
    // Checking the Ans:
    if(lTree && lTree.val === val) return lTree;
    
    // Searching in the Right Tree:
    let rTree = searchBST(root.right, val);
    // Checking the Ans:
    if(rTree && rTree.val === val) return rTree;

    // Else:
    return null;
};