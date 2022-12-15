# Solution in Java ||
## Time Complexity = O(n long n)
- It is optimised solution than that of using HashTable<> because here we are reducing the Space Complexity to O(1).
​
```java
// O(n * log(n))
import java.util.Arrays;
​
class Solution {
public int missingNumber(int[] nums) {
// Sort the array of numbers
// Time complexity: O(n * log(n))
Arrays.sort(nums);
​
// Initialize the expected number to 0
int expected = 0;
​
// Iterate over the sorted array of numbers
// Time complexity: O(n)
for (int i = 0; i < nums.length; i++) {
// Check if the current number is not equal to the expected number
if (nums[i] != expected) {
// If it is not, return the expected number
return expected;
}
​
// Increment the expected number
expected++;
}
​
// Return the expected number, since it must be the missing number
// if we reached this point in the code
return expected;
}
}
​
```
### Brut-Force Approach using HashMap: