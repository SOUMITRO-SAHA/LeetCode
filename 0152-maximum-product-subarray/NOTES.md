### Brute-Force Approach:
​
```java
class Solution {
// Brute-Force Approach:
// TC: O(n^2), SC: O(1)
public int maxProduct(int[] nums) {
int p = Integer.MIN_VALUE;
for(int i = 0; i<nums.length; i++){
int currP = nums[i];
p = Math.max(p, currP);
for(int j=i+1; j<nums.length; j++){
currP *= nums[j];
p = Math.max(p, currP);
}
}
return p;
}
}
```