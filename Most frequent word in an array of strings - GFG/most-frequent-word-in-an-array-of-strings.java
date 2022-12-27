//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    sc.nextLine();
		    Solution obj = new Solution();
		    String arr[]=sc.nextLine().split(" ");
		    System.out.println(obj.mostFrequentWord(arr, n));
		    
		}
	}
}

// } Driver Code Ends
//User function Template for Java


class Solution
{
    //Function to find most frequent word in an array of strings.
    static String mostFrequentWord(String[] s, int n){
        HashMap<String, Integer> h = new HashMap<>();
        String ans = " ";
        int maxRepeat = 0;
        for (int i = 0; i < n; i++) {
            if(h.containsKey(s[i])){
                h.put(s[i], h.get(s[i])+1);
            }
            else{
                h.put(s[i], 1);
            }
        }

        // Iterating the HashMap:
        // Finding the Maximum repeated String:
        for(String x: h.keySet()){
            maxRepeat = Math.max(maxRepeat, h.get(x));
        }
        // Returning the Second Most Repeated String:
        for(String x : s){
            if(h.get(x) == maxRepeat){
                ans = x;
                h.put(x, h.get(x) -1);
            }
        }
        return ans;
    }

}


//{ Driver Code Starts.
// } Driver Code Ends