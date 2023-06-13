class Solution {
    // Two Pointer Approach:
    // same as Binary Search:
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int si = 0, ei = len -1;
        
        // As the given array is sorted:
        while(si < ei){
            int sum = numbers[si] + numbers[ei];
            if(sum == target){
                // Found:
                return new int[]{si+1, ei+1}; // As 1-base index
            }
            else if(sum > target) ei--;
            else si++;
        }
        return new int[0];
    }
}