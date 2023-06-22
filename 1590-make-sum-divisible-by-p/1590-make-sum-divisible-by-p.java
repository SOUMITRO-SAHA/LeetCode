class Solution {
    // TC: O(n), SC: O(n)
    public int minSubarray(int[] A, int p) {
        int n = A.length;
        int res = n; // Variable to store the minimum length of the subarray
        int rem = 0; // Variable to store the remainder of the sum of elements in the array
        int curr = 0; // Variable to store the current sum of elements

        // Calculate the remainder of the sum of all elements in the array divided by 'p'
        for (int el : A) {
            rem = (rem + el) % p;
        }

        // Creating a Map to store the remainder and its corresponding index
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Initialize the map with a remainder of 0 and index -1

        // Iterate through the array to calculate the current sum and update the map
        for (int i = 0; i < n; i++) {
            curr = (curr + A[i]) % p; // Calculate the current sum by adding the current element and taking the remainder
            map.put(curr, i); // Store the current remainder and its index in the map

            int iWant = (curr - rem + p) % p; // Calculate the desired remainder
            // Calculate the length of the subarray that ends at the current index and has the desired remainder
            // Update 'res' if the current length is smaller than the previous minimum length
            res = Math.min(res, (i - map.getOrDefault(iWant, -n)));
        }

        // If 'res' is still equal to the initial value 'n', it means no subarray with the desired remainder was found
        // Return -1 in that case, otherwise return the minimum length of the subarray
        return res < n ? res : -1;
    }
}