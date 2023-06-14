class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int diff = Integer.MAX_VALUE;
        int ans = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            int first = nums[i];
            while (low < high) {
                int currSum = first + nums[low] + nums[high];
                int currDiff = Math.abs(first + nums[low] + nums[high] - target);
                
                if (currSum == target) {
                    return target;
                } else if ( currDiff < diff) {
                    diff = currDiff;
                    ans = currSum;
                }
                
                if (currSum < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return ans;
    }
}
