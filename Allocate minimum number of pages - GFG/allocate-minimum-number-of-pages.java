//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    //Function to find minimum number of pages.
    public static int findPages(int[]pages, int n,int m){
        // Edge Case:
        if(pages.length < m) return -1;
        int si = 0, ei = 0;
        for(int p: pages){
            si = Math.max(si, p);
            ei += p;
        }
        
        int pans = -1;
        while(si <= ei){
            int mid = si + (ei - si)/2;
            
            if(isPossible(pages, mid, m)){
                pans = mid;
                ei = mid -1;
            }
            else
                si = mid +1;
        }
        
        return pans;
    }
    
    private static boolean isPossible(int []pages, int maxPage, int students){
        int countOfStudents = 1;
        int pageCount = 0;
        for(int p : pages){
            int currPageCount = pageCount + p;
            if(currPageCount <= maxPage) 
                pageCount = currPageCount;
            else{
                countOfStudents++;
                pageCount = p;
            }
        }
        
        return countOfStudents <= students;
    }
};