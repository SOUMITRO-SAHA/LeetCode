//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    // So, In this Question I am gonna follow Iterative Approach, and also maintain an array as well to optimise the
    // Solution. And, Reduce the time Complexity:
    static long nthFibonacci(long n){
        long []arr = new long[(int)n + 1];
        arr[0] = 0;
        arr[1] = 1;
        // Edge Cases:
        if(n == 0 || n == 1) return arr[(int)n];

        long res = 0;
        long mod = 1000000007;
        for(int i = 2; i<=(int)n; i++){
            res = arr[i-1]%mod+arr[i-2]%mod;

            // Filling the Array:
            arr[i] = res%mod;
        }

        return res%mod;
    }
}