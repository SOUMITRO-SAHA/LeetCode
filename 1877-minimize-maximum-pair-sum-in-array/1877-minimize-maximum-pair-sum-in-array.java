class Solution {
    public int minPairSum(int[] nums) {
        // Time-Complexity:o(NlogN)
        // Space-Complexity: O(1)
        int maxPairSum = 0;
        // First Sorting the Array:
        Arrays.sort(nums);
        
        //Finding the Pair Sum:
        int st = 0;
        int ed = nums.length -1;
        while(st < ed){
            int sum = nums[st] + nums[ed];
            maxPairSum = Math.max(maxPairSum, sum);
            st++;
            ed--;
        }
        
        return maxPairSum;
    }
}