class Solution {
    public int findMaxLength(int[] arr) {
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