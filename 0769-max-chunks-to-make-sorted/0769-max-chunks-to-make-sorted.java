class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max = 0;
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            max = Math.max(arr[i], max);
            
            if(i == max) cnt++;
        }
        
        return cnt;
    }
}