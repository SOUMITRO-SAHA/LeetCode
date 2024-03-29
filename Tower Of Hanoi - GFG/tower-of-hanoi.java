//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();//total testcases
        while (T-- > 0) {
            Hanoi obj = new Hanoi();
            int N;
            
            //taking input N
            N = sc.nextInt();

            //calling toh() method 
            System.out.println(obj.toh(N, 1, 3, 2));
        }
    }
}






// } Driver Code Ends


// User function Template for Java


// avoid space at the starting of the string in "move disk....."
class Hanoi {
    private long cnt;
    public long toh(int n, int from, int to, int aux) {
        cnt = 0;
        helper(n,from, to, aux);
        return cnt;
    }
    private void helper(int n, int from, int to ,int aux){
        // Base Case:
        cnt++;
        if(n == 1){
            System.out.println("move disk "+n+" from rod "+from+" to rod "+ to);
            return;
        }
        
        // Recursive Call:
        // Removing (n-1) rods from to aux.
        helper(n-1, from, aux, to);
        System.out.println("move disk "+n+" from rod "+from+" to rod "+ to);
        helper(n-1, aux, to, from);
    }
}
