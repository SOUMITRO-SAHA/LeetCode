class Solution {
    public int maxSubArray(int[] nums) {
        // Kadane's Algorithm:
        int max = Integer.MIN_VALUE;
        int sum = 0;
        // Edge Case:
        if(nums.length == 1){
            return nums[0];
        }
        
        // Finding the Maximum element in the array:
        for(int el : nums) if(el > max) max = el;
        
        // Finding the Max subarray sum:
        for(int el : nums){
            sum += el;
            if(sum < 0){
                // -Ve Case Not required
                sum = 0;
            }
            else{
                // +Ve Case:
                if(sum > max) max = sum;
            }
        }

        return max;
    }
}