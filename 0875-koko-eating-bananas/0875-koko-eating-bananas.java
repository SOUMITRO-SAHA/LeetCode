class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=Integer.MIN_VALUE;
        
        for(int i=0;i<piles.length;i++){
            high=Math.max(high,piles[i]);
        }
        
        while(low<high){
            int mid = low+(high-low)/2;
            if(isPossible(mid, piles, h)){
                high = mid;
            }
            else
                low = mid+1;
        }
        
        return low;
    }
    public boolean isPossible(int mid, int[] piles, int h){
        int time=0;
        
        for(int ele: piles){
            time += (int) Math.ceil(ele * 1.0 / mid);
        }
        return time <= h;
    }
}