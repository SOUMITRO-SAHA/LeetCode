import java.util.Arrays;

class Solution {
    // TC: O(n^2), SC: O(1)
    public int threeSumClosest(int[] nums, int target) {
        // Initialize variables to store the minimum difference and the answer
        int diff = Integer.MAX_VALUE;
        int ans = 0;

        // Sort the input array in ascending order
        Arrays.sort(nums);

        // Iterate through the array, considering each element as the first number in the triplet
        for (int i = 0; i < nums.length - 2; i++) { // O(n)
            // Set the low and high pointers for the remaining elements in the array
            int low = i + 1;
            int high = nums.length - 1;
            
            // Store the value of the first number in the triplet
            int first = nums[i];
            
            // Continue searching for the other two numbers until low and high pointers meet
            while (low < high) { // O(n)
                // Calculate the current sum and the absolute difference between the sum and the target
                int currSum = first + nums[low] + nums[high];
                int currDiff = Math.abs(currSum - target);
                
                // If the current sum equals the target, return the target sum
                if (currSum == target) {
                    return target;
                } 
                // If the current difference is smaller than the minimum difference encountered so far,
                // update the minimum difference and the answer
                else if (currDiff < diff) {
                    diff = currDiff;
                    ans = currSum;
                }
                
                // Adjust the low and high pointers based on the comparison with the target sum
                if (currSum < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        
        // Return the closest sum to the target
        return ans;
    }
}
