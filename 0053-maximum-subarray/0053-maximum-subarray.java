class Solution {
    public int maxSubArray(int[] n) {
        // Kadane's Algorithm:
        int train = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<n.length; i++){
            // If n[i] site's inthe previous train
            int prev = train + n[i];
            
            // If n[i] will starts it's own train
            int newTrain = n[i];
            
            // So, finally the current train will be
            train = Math.max(prev, newTrain);
            
            // And, the max of the sub-array will be
            max = Math.max(max, train);
        }
        
        return max;
    }
}