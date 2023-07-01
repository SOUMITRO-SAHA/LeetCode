### Brute-Force Approach:
​
```java
class Solution {
public int firstMissingPositive(int[] nums) {
int n = nums.length;
// Creating a HashMap:
Set<Integer> set = new HashSet<>();
// Putting all the elements into the Array:
int max = 0;
for(int el: nums){
max = Math.max(max, el);
set.add(el);
}
// Iteration:
for(int i=1; i <= n+1; i++){
if(!set.contains(i)) return i;
}
return -1;
}
}
```