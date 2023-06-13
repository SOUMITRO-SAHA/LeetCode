class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Sort the array in non-decreasing order
        Arrays.sort(nums); // O(n log n)

        int i = 0;
        int n = nums.length;
        while (i < n) {
            int left = i + 1;
            int right = n - 1;
            int target = 0 - nums[i]; // Calculate the target sum
            int prevI = nums[i]; // Store the previous value of nums[i] for comparison

            while (left < right) {
                int prevRight = nums[right];
                int prevLeft = nums[left];
                int sum = nums[left] + nums[right];

                if (sum == target) {
                    // Found a valid triplet that sums up to the target
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    result.add(triplet);

                    // Move the left and right pointers to skip duplicates
                    while (left < right && nums[left] == prevLeft) left++;
                    while (left < right && nums[right] == prevRight) right--;
                } else if (sum > target) {
                    // Reduce the sum by moving the right pointer towards the left
                    while (left < right && nums[right] == prevRight) right--;
                } else {
                    // Increase the sum by moving the left pointer towards the right
                    while (left < right && nums[left] == prevLeft) left++;
                }
            }

            // Move the i pointer to skip duplicates
            while (i < n && nums[i] == prevI) i++;
        }

        return result;
    }
}
