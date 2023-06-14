class Solution {
    // TC: O(n)
    // SC: O(1)
    public int maxProfit(int[] prices) {
        // Initialize the minimum price to the first element in the array
        int min = prices[0];

        // Initialize the maximum profit to zero
        int maxProfit = 0;

        // Get the length of the prices array
        int n = prices.length;

        // Loop through each element in the prices array
        for(int i=0; i<n; i++){
            // Calculate the difference between the current price and the minimum price
            int cost = prices[i] - min;

            // Update the maximum profit if the current cost is greater than the current maxProfit
            maxProfit = Math.max(maxProfit, cost);

            // Update the minimum price if the current price is lower than the current min
            min = Math.min(min, prices[i]);
        }

        // Return the maximum profit
        return maxProfit;
    }
}