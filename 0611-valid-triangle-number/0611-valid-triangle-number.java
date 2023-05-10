class Solution {
    // TC: O(n^2); SC: O(1)
    public int triangleNumber(int[] nums) {
        int cnt = 0;
        // Sorting the Array:
        Arrays.sort(nums);
        
        // Start iterating from the end:
        // This is an extension of Three Sum Problem:
        for(int i = nums.length -1; i>= 0; i--){ // O(n)
            int sp = 0, ep = i-1;
            while(sp < ep){ // O(n)
                int sum = nums[ep] + nums[sp];
                
                if(sum > nums[i]){
                    // Valid Tribles and all the elements between is also a balid tirplets:
                    cnt += (ep - sp);
                    ep --;
                }
                else sp++;
            }
        }
        
        return cnt;
    }
}