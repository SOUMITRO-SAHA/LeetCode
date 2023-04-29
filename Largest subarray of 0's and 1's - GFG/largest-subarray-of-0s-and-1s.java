//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.util.HashMap;

class Largest_Subarray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int N = sc.nextInt();
            int a[] = new int[N];
            for (int i = 0; i < N; i++) 
                a[i] = sc.nextInt();
            

            Solution g = new Solution();
            int n = g.maxLen(a, a.length);

            System.out.println(n);

            T--;
        }
    }
}

// } Driver Code Ends




class Solution {

    // arr[] : the input array containing 0s and 1s
    // N : size of the input array
    
    // return the maximum length of the subarray
    // with equal 0s and 1s
    int maxLen(int[] arr, int N){
		int n = arr.length;
        // Defining the Initial Variables:
		int x0 = 0, x1 = 0;
		int maxLen = 0;

		// Differences:
		int d1 = (x1 - x0);

		// Creating the HashMap:
		HashMap<Integer, Integer> map = new HashMap<>();
		// Putthing the Initial Value:
		map.put(0, -1);

		// Iterating throught the Array to find the Count of Subarrays with equal 0,1,2:
		for(int i = 0; i<n; i++){
			int ele = arr[i];
			// Updating the Variables according the current element:
			x0 = (ele == 0)? x0 + 1: x0;
			x1 = (ele == 1)? x1 + 1: x1;

			// Getting the Difference:
			d1 = (x1 - x0);

			// Putting the Key into the HM:
			if(!map.containsKey(d1)){
				map.put(d1, i);
			}
			else{
				// If the Key is already Present:
				int currLen = i - map.get(d1);
				maxLen = Math.max(currLen, maxLen);
			}
		}

		// Return
		return maxLen;
    }
}
