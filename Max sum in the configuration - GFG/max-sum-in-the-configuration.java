//{ Driver Code Starts
import java.util.*;

class Maxsum_Among_All_Rotations_Array
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			
			System.out.println(new GfG().max_sum(arr,n));
			
		t--;
		}
	}
	
}

// } Driver Code Ends

class GfG {
    // Optimal Approach:
    // TC: O(n), SC: O(1)
    int max_sum(int[] arr, int n) {
        int sum = 0;
        int s0 = 0;

        // First, Calculating the total sum and s0
        for (int i = 0; i < n; i++) {
            sum += arr[i]; // Calculate the total sum of the array elements
            s0 += arr[i] * i; // Calculate s0 by multiplying each element with its index
        }

        // Second, Now I have to find the other si+1 using si
        int max = s0; // Initialize max with s0
        int si = s0; // Initialize si with s0

        for (int i = 0; i < n - 1; i++) {
            // Calculate the next si+1 using the current si, sum, and the element at index n-i-1
            int sip1 = si + sum - n * arr[n - i - 1];

            if (sip1 > max)
                max = sip1; // Update max if sip1 is greater than the current max
            si = sip1; // Update si for the next iteration
        }

        return max; // Return the maximum sum
    }
}

