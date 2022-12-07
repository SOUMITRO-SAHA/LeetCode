import java.util.*;
import java.util.Hashtable;

/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        Hashtable<Integer, Integer> hash = new Hashtable<>();

        // Taking all Array elements into the HashTable:
        for (int num : nums) {
            if (hash.containsKey(num)) { // If the key is already present in the HashTable:
                hash.put(num, hash.get(num) + 1);
            } else {
                hash.put(num, 1);
            }
        }

        // Traversing the HashTable to find the key which has value 1:
        for (int key : hash.keySet()) {
            if (hash.get(key) == 1) {
                return key;
            }
        }

        // If not found
        return -1;
    }
}
// @lc code=end
