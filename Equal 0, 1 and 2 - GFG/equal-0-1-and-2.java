//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String str = read.readLine().trim();
            Solution obj = new Solution();
            System.out.println(obj.getSubstringWithEqual012(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution { 
	// TC: O(n), SC: O(n)
    long getSubstringWithEqual012(String str) { 
        int n = str.length();
        
        // Defining the Initial Variables:
		int x0 = 0, x1 = 0, x2 = 0;
		int count = 0;

		// Differences:
		int d1 = (x1 - x0);
		int d2 = (x2 - x1);

		// Creating the HashMap:
		HashMap<String, Integer> map = new HashMap<>();
		// Putthing the Initial Value with{key, value: frequency}:
		map.put("0#0", 1);

		// Iterating throught the Array to find the Count of Subarrays with equal 0,1,2:
		for(int i = 0; i<n; i++){
			StringBuilder key = new StringBuilder();
			char ele = str.charAt(i);
			// Updating the Variables according the current element:
			x0 = (ele == '0')? x0 + 1: x0;
			x1 = (ele == '1')? x1 + 1: x1;
			x2 = (ele == '2')? x2 + 1: x2;

			// Getting the Difference:
			d1 = (x1 - x0); d2 = (x2 - x1);

			// Creating the Key:
			key.append(d1);
			key.append("#");
			key.append(d2);
			
			// Putting the Key into the HM:
			if(map.containsKey(key.toString())){
				// If the Key is already Present:
				count += map.get(key.toString());
				map.put(key.toString(), map.get(key.toString())+1);
			}
			else{
				// If the Key is not present:
				map.put(key.toString(), 1);
			}
		}

		// Return
		return count;
    }
} 