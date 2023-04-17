class Solution {
    public long repairCars(int[] ranks, int cars) {
        long si = 0;
        long ei = -1;
        int min = Integer.MAX_VALUE;
        
        // Finding the high value:
        for(int r: ranks){
            min = Math.min(min, r);
        }
        ei = (long) min * cars*cars;
        // Finding the Number using Binary Search:
        long pans = -1;
        while(si <= ei){
            long mid = si + (ei-si)/2;
            
            if(isPossible(ranks, mid, cars)){
                pans = mid;
                ei = mid -1;
            }
            else si = mid +1;
        }
        return pans;
    }
    
    private boolean isPossible(int []ranks, long time, int cars){
        long carRepaired = 0;
        for(int r: ranks){
            carRepaired +=(long) Math.sqrt(time/ (long) r);
        }
        
        return carRepaired >= (long)cars;
    }
}