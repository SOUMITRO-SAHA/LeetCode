class Solution {
    // Brute Force Approach
    public double myPow(double x, int n) {
        // Base Case:
        if(n == 0) return 1;
        if(n == 1) return x;
        if(n == -1) return (1/x);
        
        // Recursive Call:
        // Checking for Odd and Even:
        if(n%2 == 0){
            // Even Case:
            return myPow(x*x, n/2);
        }
        else{
            // Odd Case:
            if(n < 0){
                // Negative Case:
                return (1/x) * myPow(x*x, n/2);
            }
            // Positive Case:
            return x * myPow(x*x, n/2);
        }
        
    }
}