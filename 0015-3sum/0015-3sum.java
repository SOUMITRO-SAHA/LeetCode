class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        // Step-1: Sort the Array:
        Arrays.sort(nums); // O(n log n)

        int i = 0;
        int n = nums.length;
        while(i<n){
            int l = i+1;
            int r = nums.length -1;
            int target = 0 - nums[i];
            int prevI = nums[i];
            while(l < r){
                int prevR = nums[r];
                int prevL = nums[l];
                int sum = nums[l] + nums[r];

                if(sum == target){
                    List<Integer> ans = new ArrayList<>();
                    ans.add(nums[i]); ans.add(nums[l]); ans.add(nums[r]);

                    res.add(ans);
                    while(l < r && nums[l] == prevL) l++;
                    while(r > l && nums[r] == prevR) r--;
                }
                else if(sum > target) while(r > l && nums[r] == prevR) r--;
                else while(l < r && nums[l] == prevL) l++;
            }
            while(i < n && nums[i] == prevI) i++;
        }

        return res;
    }
}