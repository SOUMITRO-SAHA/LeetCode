//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];
            
            int D = Integer.parseInt(read.readLine());
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.leastWeightCapacity(arr,N,D));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static boolean isPossible(int []arr, int cap, int days){
        int dayCount = 1;
        int wt = 0;
        for(int el : arr){
            int currentCap = wt + el;
            if(currentCap <= cap) wt = currentCap;
            else{
                dayCount++;
                wt = el;
            }
        }
        
        return dayCount <= days;
    }
    static int leastWeightCapacity(int[] arr, int N, int D) {
        int si, ei = 0;
        int max = Integer.MIN_VALUE;
        for(int el : arr){
            max = Math.max(max, el);
            ei += el;
        }
        // Assigining the max value to si:
        si = max;
        
        int pans = -1;
        while(si <= ei){
            int mid = si + (ei - si)/2;
            if(isPossible(arr, mid, D)){
                pans = mid;
                ei = mid -1;
            }
            else si = mid +1;
        }
        
        return pans;
    }
};