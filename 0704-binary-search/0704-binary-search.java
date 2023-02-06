class Solution {
    public int search(int[] nums, int target) {
        // Binary Search using Recursion:
        return binarySearchUsingRecursion(nums, target, 0, nums.length -1);
    }
    
    int binarySearchUsingRecursion(int []arr,int target, int st, int end){
        int mid = st + (end - st)/2;
        // Base Case:
        if(st > end)
            return -1;
        if (arr[mid] == target) {
            return mid;
        }

        // Recursive Call:
        else if(arr[mid] < target){
            return  binarySearchUsingRecursion(arr, target, mid +1, end);
        }

        return binarySearchUsingRecursion(arr,target,st, mid -1);

    }
}