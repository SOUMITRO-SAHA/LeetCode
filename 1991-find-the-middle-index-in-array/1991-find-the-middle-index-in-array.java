class Solution {
    public int findMiddleIndex(int[] nums) {
        if (nums == null || nums.length == 0) return -1;

        // First, we compute the total sum of all numbers in the array
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        // Then, we iterate over the array and keep track of the prefix and suffix sums
        int prefix = 0, suffix = sum;
        for (int i = 0; i < nums.length; i++) {
            // We update the suffix sum to exclude the current number
            suffix -= nums[i];
            // If the prefix sum is equal to the suffix sum, we have found the middle index
            if (prefix == suffix) return i;
            // We update the prefix sum to include the current number
            prefix += nums[i];
        }
        // If we reach this point, it means that no middle index was found
        return -1;
    }
}