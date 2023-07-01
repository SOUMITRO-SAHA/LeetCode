class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        
        boolean one = false;
        // Making the elements which are out of range
        for(int i=0; i<n; i++){
            int ele = nums[i];
            if(ele == 1) one = true;
            if(ele > n || ele < 1) nums[i] = 1;
        }
        
        // Check whether one = false or not
        // if false return 1
        if(one == false) return 1;
        
        
        // Checking for Missing Number:
        for(int i=0; i<n; i++){
            int idx = Math.abs(nums[i]);
            
            // making the relatinve index with -1
            nums[idx -1] = -Math.abs(nums[idx -1]);
        }
        
        // Now check for any positive value:
        for(int i=0; i<n; i++){
            if(nums[i] > 0) return i+1;
        }
        
        return n + 1;
    }
}