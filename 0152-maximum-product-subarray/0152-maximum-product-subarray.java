class Solution {
    // Optimal Approach:
    // TC: O(n), SC: O(1)
    public int maxProduct(int[] nums) {
        int max_so_far = nums[0];
        int min_so_far = nums[0];
        int ans = max_so_far;
        
        for(int i=1; i<nums.length; i++){
            int ele = nums[i];
            
            int temp_max = Math.max(ele, Math.max(max_so_far * ele, min_so_far * ele));
            min_so_far = Math.min(ele, Math.min(max_so_far * ele, min_so_far * ele));
            
            max_so_far = temp_max;
            
            ans = Math.max(max_so_far, ans);
        }
        
        return ans;
    }
}