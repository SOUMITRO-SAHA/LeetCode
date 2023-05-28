class Solution {
    public void nextPermutation(int[] nums) {
        // Step-1: Find the Break Point
        int idx = -1, len = nums.length;
        for(int i=len -2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            // Swap:
            Arrays.sort(nums);
            return;
        }
        // Step-2: Find the just smaller element then element at idx:
        for(int i=len-1; i>=0; i--){
            if(nums[i] > nums[idx]){
                swap(nums, i, idx);
                break;
            }
        }
        // Step-3: Sort the rest of the array:
        reverse(nums, idx+1, len);
    }
    private void swap(int []arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private void reverse(int []arr, int si, int ei){
        ei -= 1;
        while(si < ei){
            swap(arr, si, ei);
            si++;
            ei--;
        }
    }
}