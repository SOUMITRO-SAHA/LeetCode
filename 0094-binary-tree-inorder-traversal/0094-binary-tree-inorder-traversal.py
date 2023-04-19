# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        res = []
        self.f(root, res)
        return res
    
    def f(self, root: Optional[TreeNode], res: List[int]):
        # Base Case:
        if(root == None): return None
        
        # Recursive Call:
        self.f(root.left, res)
        res.append(root.val)
        self.f(root.right, res)
        