class Solution {
    // Optimal Approach:
    // Using HashMap + Prefix Sum:
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> fmap = new HashMap<>();
        fmap.put(0,1); // Filling value 0 with fq 1, before starting 
        
        int sum = 0, cnt = 0;
        for(int el: nums){
            sum += el;
            int diff = sum - k;
            // Check into the Map, Whether the difference present or not
            // If present that means sub array with sum k present.
            // update the fq of sum:
            if(fmap.containsKey(diff)){
                cnt += fmap.get(diff);
            }
            
            // Updating the Frequency:
            fmap.put(sum, fmap.getOrDefault(sum, 0)+1);
        }
        return cnt;
    }
}