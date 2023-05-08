class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // Sort the array in ascending order to easily determine if a solution is found
        Arrays.sort(nums);
        // Call the helper method "kSum" with k = 4 to find all unique quadruplets that sum up to the target value
        return kSum(nums, target, 0, 4);
    }
	
    private List<List<Integer>> kSum(int[] nums, long target, int startIndex, int k) {
        List<List<Integer>> result = new ArrayList<>();
        
        // If there are no more numbers to add, return the empty result
        if (startIndex == nums.length) {
            return result;
        }
        
        // Calculate the average value of the remaining values to be added to the sum
        long averageValue = target / k;
        
        // If the smallest value in the array is greater than the average value or the largest value is less than the average value, then a solution cannot be found
        if (nums[startIndex] > averageValue || averageValue > nums[nums.length - 1]) {
            return result;
        }
        
        // If k equals 2, call the "twoSum" helper method to find all pairs that sum up to the target value
        if (k == 2) {
            return twoSum(nums, target, startIndex);
        }
        
        // Iterate over the array and recursively call the "kSum" method to find all unique combinations of (k-1) numbers that sum up to (target - nums[i])
        for (int i = startIndex; i < nums.length; i++) {
            // Skip over duplicate values
            if (i == startIndex || nums[i - 1] != nums[i]) {
                for (List<Integer> subset : kSum(nums, target - nums[i], i + 1, k - 1)) {
                    // Add the current value to each subset to form a unique quadruplet
                    result.add(new ArrayList<>(Arrays.asList(nums[i])));
                    result.get(result.size() - 1).addAll(subset);
                }
            }
        }
        
        // Return the result list
        return result;
    }
	
    private List<List<Integer>> twoSum(int[] nums, long target, int startIndex) {
        List<List<Integer>> result = new ArrayList<>();
        int left = startIndex, right = nums.length - 1;
        
        // Use two pointers to find all pairs that sum up to the target value
        while (left < right) {
            int currentSum = nums[left] + nums[right];
            if (currentSum < target || (left > startIndex && nums[left] == nums[left - 1])) {
                // Increment the left pointer if the sum is less than the target or if the left value is a duplicate
                left++;
            } else if (currentSum > target || (right < nums.length - 1 && nums[right] == nums[right + 1])) {
                // Decrement the right pointer if the sum is greater than the target or if the right value is a duplicate
                right--;
            } else {
                // Add the pair to the result list if it is a unique solution
                result.add(Arrays.asList(nums[left++], nums[right--]));
            }
        }
        
        // Return the result list
        return result;
    }
}
