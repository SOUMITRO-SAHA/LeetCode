//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) {
        Stack<Integer> st = new Stack<>();
        long maxArea = 0;
        
        for(int i=0; i<(int)n; i++){
            long ele = hist[i];
            
            while(st.size()>0 && ele < hist[st.peek()]){
                int idx = st.pop();
                int rightBoundary = i;
                int leftBoundary = (st.size() > 0)?st.peek(): -1;
                
                long width = rightBoundary - leftBoundary -1;
                long height = hist[idx];
                long currArea = width * height;
                
                maxArea = Math.max(currArea, maxArea);
            }
            
            st.push(i);
        }
        
        // St is not empty:
        while(st.size() > 0){
            int idx = st.pop();
            int rightBoundary = (int)n;
            int leftBoundary = (st.size() > 0)?st.peek(): -1;
            
            long width = rightBoundary - leftBoundary -1;
            long height = hist[idx];
            long currArea = width * height;
            
            maxArea = Math.max(currArea, maxArea);
        }
        
        return maxArea;
    }
}



