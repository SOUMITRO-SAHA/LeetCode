class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int []pre = new int[1001]; // Store the prefix sum for each station
        
        // Iterate over the trips and set the pre[]
        for(int []t: trips){
            int p = t[0];
            int ss = t[1];
            int es = t[2];
            
            // Updating the Pre:
            pre[ss] += p;
            pre[es] -= p;
        }
        
        // Calculating the Passangers at every Station
        for(int i=1; i<pre.length; i++){
            pre[i] += pre[i-1];
        }
        
        // Checking the capacity for every station:
        for(int el : pre){
            if(el > capacity) return false;
        }
        
        return true;
    }
}