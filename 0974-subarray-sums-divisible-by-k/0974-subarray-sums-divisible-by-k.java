class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        // Putting the 1st value (0,1) => means 0 comes 1 times.
        h.put(0,1);
        
        // Variables:
        int sum = 0;
        int ans = 0;
        
        // Iterating
        for(int i : nums){
            sum += i;
            // Finding the remainder:
            int rem = sum % k;
            
            // Checking the value is less or greater then 0
            if(rem < 0) 
                rem += k;
            
            // Checking:
            if(h.containsKey(rem)){
                ans += h.get(rem);
            }
            
            // Putting the rem into the HashMap:
            h.put(rem, h.getOrDefault(rem, 0) +1);
        }
        
        return ans;
    }
}