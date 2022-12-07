import java.util.*;
import java.util.Hashtable;

/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start

class Solution {
    public int majorityElement(int[] nums) {
        Hashtable<Integer, Integer> hash = new Hashtable<>();

        // Taking the Array elements to the HashTable
        for (int num : nums) {
            if (hash.containsKey(num)) {
                hash.put(num, hash.get(num) + 1);
            } else {
                hash.put(num, 1);
            }
        }

        // Traversing Through the HashTable to check for Majority Element:
        for (int x : hash.keySet()) {
            if (hash.get(x) > nums.length / 2) {
                return x;
            }
        }
        return -1;
    }
}
// @lc code=end
