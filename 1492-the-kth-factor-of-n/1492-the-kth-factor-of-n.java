class Solution {
    // Brute-Force:
    // TC: O(n)
    public int kthFactor(int n, int k) {
        int kFact = 0; // Maintaining a Counter.
        
        // Iterate till n: And try to find the k'th Factor.
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                kFact++;
            }
            // Checking for K'th Factor:
            if(kFact == k) return i;
        }
            
        return -1;
    }
}