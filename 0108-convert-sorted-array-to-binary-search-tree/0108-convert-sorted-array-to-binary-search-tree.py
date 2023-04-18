# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sortedArrayToBST(self, nums: List[int]) -> Optional[TreeNode]:
        # In-Order Traversal:
        root = self.construct(nums, 0, len(nums)-1);
        return root
    
    def construct(self, arr:List[int], l, r) -> Optional[TreeNode]:
        if l > r : return None
        
        mid = l + (r-l)//2
        
        node = TreeNode(arr[mid])
        root = node
        root.left = self.construct(arr, l, mid-1)
        root.right = self.construct(arr,mid+1, r)
        
        return root;
        