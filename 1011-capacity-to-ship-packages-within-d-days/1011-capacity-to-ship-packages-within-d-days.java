class Solution {
    private boolean isPossible(int []weights, int cap, int days){
        int dayCount = 1;
        int wt = 0;
        for(int el : weights){
            int currentCap = wt + el;
            if(currentCap <= cap) wt = currentCap;
            else{
                dayCount++;
                wt = el;
            }
        }
        
        return dayCount <= days;
    }
    
    public int shipWithinDays(int[] weights, int days) {
        int si, ei = 0;
        int max = Integer.MIN_VALUE;
        for(int el : weights){
            max = Math.max(max, el);
            ei += el;
        }
        // Assigining the max value to si:
        si = max;
        
        int pans = -1;
        while(si <= ei){
            int mid = si + (ei - si)/2;
            if(isPossible(weights, mid, days)){
                pans = mid;
                ei = mid -1;
            }
            else si = mid +1;
        }
        
        return pans;
    }
}