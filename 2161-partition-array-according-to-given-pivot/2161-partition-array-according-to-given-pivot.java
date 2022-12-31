class Solution {
    public int[] pivotArray(int[] nums, int pi) {
        // Time-Complexity: O(n):
        // Space-Complexity: 0(n):
        int len = nums.length;
        int []arr = new int[len];
        int position = 0;
        int pivoteEl = 0;
        
        // First Taking the Smaller Elements:
        for(int i=0; i<len; i++){
            if(nums[i] == pi) pivoteEl++;
            else if(nums[i] < pi){
                arr[position++] = nums[i];
            }
        }
        
        // Second Populate the Pivot Elements
        for(int i=0; i<pivoteEl; i++){
            arr[position++] = pi;
        }
        
        // Third Taking the Larger Elements
        for(int i=0; i < len; i++){
            if(nums[i] > pi)
                arr[position++] = nums[i];
        }
        
        return arr;
        
    }
}