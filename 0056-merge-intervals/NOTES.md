```java
class Solution {
public int[][] merge(int[][] intervals) {
// Create a list to store the merged intervals
List<int[]> answer = new ArrayList<>();
// Check if the intervals array is not empty or null
if(intervals.length != 0 || intervals != null){
Arrays.sort(intervals, (a,b) -> a[0] - b[0]); // Sort the intervals based on the start time
// Initialize the start and end variables with the first interval
int start = intervals[0][0];
int end = intervals[0][1];
// Iterate over the intervals
for(int[] i: intervals){
if(i[0] <= end){ // If the current interval overlaps with the previous one
// Update the end time if necessary
end = Math.max(end, i[1]);
} else {
// The current interval does not overlap, add the merged interval to the answer
answer.add(new int[]{start,end});
// Update the start and end variables with the current interval
start = i[0];
end = i[1];
}
}
// Add the last merged interval to the answer
answer.add(new int[]{start,end});
}
// Convert the list of merged intervals to a 2D array and return
return answer.toArray(new int[0][]);
}
}
```
​