class Solution {
    // Optimum Approach:
    // TC: O(n)
    // SC: O(1)
    public int maxSubArray(int[] nums) {
        // Kadane's Algorithm:
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        // Finding the Max subarray sum:
        for(int el : nums){
            sum += el;
            max = Math.max(sum, max);
            if(sum < 0){
                // -Ve Case Not required
                sum = 0;
            }
        }

        return max;
    }
}