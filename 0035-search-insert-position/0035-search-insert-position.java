class Solution {
    public int searchInsert(int[] nums, int target) {
        int si = 0;
        int ei = nums.length-1;
        int idx = ei+1;
        while(si < ei){
            int mid = si + (ei - si)/2;
            
            // Conditions:
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                idx = mid;
                ei = mid -1;
            }
            else{
                si = mid +1;
            }
        }
        return (si==ei && nums[si] >= target)? si : idx;
    }
}