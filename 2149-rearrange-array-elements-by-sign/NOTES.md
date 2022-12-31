# Brut-Force Approach :
```java
class Solution {
public int[] rearrangeArray(int[] nums) {
// Time-Complexity: O(n);
// Space-Complexity: O(n);
int len = nums.length;
int[] ans = new int[len];
int positive = 0;
int negative = 1;
for(int i=0; i<len; i++){
if(nums[i] >= 0){
ans[positive] = nums[i];
positive += 2;
}
else if(nums[i] < 0){
ans[negative] = nums[i];
negative += 2;
}
}
return ans;
}
}
```