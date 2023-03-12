//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n){ 
        // It will store the potential next Larger elements
        Stack<Long> st = new Stack<>();
        
        // Storing the answers
        long[] nl = new long[n];
        
        // Iterating from the right side:
        for(int i=n-1; i>=0; i--){
            long ele = arr[i];
            
            // Checking whether the stack element is greater then the current element or not:
            while(st.size() > 0 && st.peek() <= ele){
                // Removing the peek() element:
                st.pop();
            }
            
            // Peek element is greater then current element:
            if(st.size() > 0){
                nl[i] = st.peek();
            }
            else{
                nl[i] = -1;
            }
            
            // Adding the current element to the stack 
            st.push(ele);
        }
        
        return nl;
    } 
}