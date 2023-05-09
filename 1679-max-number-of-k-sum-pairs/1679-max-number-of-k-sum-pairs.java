class Solution {
    public int maxOperations(int[] nums, int k) {
        // Step-1: Sort the Array:
		Arrays.sort(nums);
		// Step-2: Maintaining 2 Pointers:
		int sp = 0, ep = nums.length -1, cnt = 0;
		while(sp < ep){
			int sum = nums[sp] + nums[ep];
			if(sum == k){
				cnt++;
				sp++;
				ep--;
			}
			else if(sum > k) ep--;
			else sp++;
		}
		return cnt;
    }
}