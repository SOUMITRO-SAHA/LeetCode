class Solution {
    // Solving with Optimised Approach: Using HashMap:
    // TC: O(n); SC: O(n)
    public int findPairs(int[] nums, int k) {
        // First, Maintain a frequency HM:
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        // Second, Now getting the count by traversing the HM:
        int cnt = 0;
        for(int key: map.keySet()){
            if(k != 0 && map.containsKey(key+k) || k == 0 && map.get(key) > 1)
                cnt++;
        }
        return cnt;
    }
}