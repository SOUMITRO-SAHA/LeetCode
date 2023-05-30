class Solution {
    public int findTheWinner(int n, int k) {
        return helper(n,k) + 1;
    }
    private int helper(int n, int k){
        // Base Case:
        if(n == 1) return 0;
        
        // Recursive Call:
        int x = helper(n-1, k);
        int y = (x+k)%n;
        return y;
    }
}