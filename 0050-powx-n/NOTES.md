### Brute-Force Approach:
​
```java
class Solution {
// Brute Force Approach
public double myPow(double x, int n) {
// Base Case:
if(n == 0) return 1;
// Recursive Call:
if(n < 0){
// Negative Power
return (1/x) * myPow(x, n+1);
}
else{
// Positive Power
return x * myPow(x, n-1);
}
}
}
```