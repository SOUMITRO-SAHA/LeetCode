class Solution {
    public int findDuplicate(int[] nums) {
        // Find the insertion points of two runner
        int fast = nums[0];
        int slow = nums[0];
        
        do{
            fast = nums[nums[fast]];
            slow = nums[slow];
        }while(fast != slow);
        
        // Find the 'enterance' to the cycle:
        fast = nums[0];
        while(fast != slow){
            fast = nums[fast];
            slow = nums[slow];
        }
        
        return slow;
    }
}