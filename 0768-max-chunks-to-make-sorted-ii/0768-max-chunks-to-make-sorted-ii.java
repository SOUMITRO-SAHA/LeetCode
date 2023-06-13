class Solution {
    public int maxChunksToSorted(int[] arr) {
        // 1. Generate right min
        int []rmin = new int[arr.length +1];
        
        rmin[arr.length] = Integer.MAX_VALUE;
        for(int i=arr.length -1; i>= 0; i--){
            rmin[i] = Math.min(rmin[i+1], arr[i]);
        }
        // 2. iterate on array and manage left max as well as count chunks:
        int leftMax = Integer.MIN_VALUE;
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            leftMax = Math.max(leftMax, arr[i]);
            if(leftMax <= rmin[i+1]) cnt++;
        }
        
        return cnt;
    }
}