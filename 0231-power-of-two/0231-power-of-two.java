class Solution {
    public boolean isPowerOfTwo(int n) {
        // Base Case:
        if(n == 2 || n == 1) return true;
        if(n % 2 != 0 || n == 0) return false;
        
        // Recursive Call:
        return isPowerOfTwo(n/2);
    }
}