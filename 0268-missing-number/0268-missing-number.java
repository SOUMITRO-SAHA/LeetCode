import java.util.HashMap;
class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Taking Values to the HashMap
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        // Traversing the HashMap to check for the missing number
        for (int i = 0; i <= nums.length; i++) {
            if (!map.containsKey(i))
                return i;
        }
        return -1;
    }
}