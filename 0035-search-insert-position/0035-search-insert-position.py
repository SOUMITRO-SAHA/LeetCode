class Solution:
    # Binary Search:
    def searchInsert(self, nums: List[int], target: int) -> int:
        si = 0
        ei = len(nums) - 1
        pans = len(nums)
        while si <= ei:
            mid = math.floor(si + (ei - si) / 2)
            if nums[mid] == target: return mid
            elif nums[mid] > target:
                pans = mid
                ei = mid -1
            else: si = mid +1

        return pans