class Solution {
    // Brute-Force Approach:
    public int subarraySum(int[] nums, int x) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                // Checking for sum == target value:
                if(sum == x) count++;
            }
            
        }
        
        return count;
    }
}