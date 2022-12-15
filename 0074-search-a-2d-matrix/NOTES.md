## Optimized Approach || Using Binary Search
#### Time-Complexity : O(n lon n)
#### Space-Complexity: O(1);
​
```java
class Solution {
public boolean searchMatrix(int[][] matrix, int target) {
int row = matrix.length;
int col = matrix[0].length;
// Traversing through the row and col for searching the key
for(int i=0; i<row; i++){
// int []arr = matrix[i];
// Using Binary Search to find the key
int s = 0;
int e = col-1;
while(s < e){
int mid = (s + e)/2;
if(matrix[i][mid] == target){
return true;
}
else if(target < matrix[i][mid])
e = mid -1;
else if(matrix[i][mid] < target)
s = mid +1;
}
}
return false;
}
}
```
---
​
## Brut-Force Approach
- matrix size `n*m`
​
```java
class Solution {
public boolean searchMatrix(int[][] matrix, int target) {
int row = matrix.length;
int col = matrix[0].length;
// Traversing through the row and col for searching the key
for(int i=0; i<row; i++){
for(int j=0; j<col; j++){
if(matrix[i][j] == target) return true;
}
}
return false;
}
}
```
#### Time-Complexity : O(n*m)
#### Space-Complexity: O(1);
​
---
​
​