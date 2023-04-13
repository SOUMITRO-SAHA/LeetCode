class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int si = 0;
        int ei = n -1;
        int foundAt = -1;
        while(si <= ei){
            int mid = si + (ei - si)/2;
            if(nums[mid] == target){
                foundAt = mid;
                break;
            }
            else if(nums[mid] > target) ei = mid -1;
            else si = mid +1;
        }
        
        if(foundAt == -1)return new int[]{-1,-1};
        else if(foundAt == n - 1 || nums[foundAt + 1] != target){
            ei = foundAt;
            si = ei;
            while(si >= 0 && nums[si] == target) si--;
            si++;
        }
        else if(foundAt == 0 || nums[foundAt - 1] != target){
            si = foundAt;
            ei = si;
            while(ei < n && nums[ei] == target) ei++;
            ei--;
        }
        else if(nums[foundAt] == target && nums[foundAt-1] == target && nums[foundAt+1] == target){
            si = ei = foundAt;
            while (si >= 0 && nums[si] == target) si--;
            si++;
            while (ei < n  && nums[ei] == target)ei++;
            ei--;
        }
        
        return new int[]{si, ei};
    }
}