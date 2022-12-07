class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        // Taking the Element into the Hashmap
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }

        // Checking the result
        for (int i = 0; i < n; i++) {
            int number = nums[i];
            int rem = target - number;
            if (map.containsKey(rem)) {
                int idx = map.get(rem);
                // Condition for same index
                if (idx == i)
                    continue;
                return new int[] { i, idx };
            }
        }
        return new int[] {};
    }
}