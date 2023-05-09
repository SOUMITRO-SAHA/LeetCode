class Solution {
    // TC: O(n); SC: O(m) => Elements of Decresing order.
    public int maxWidthRamp(int[] nums){
        Stack<Integer> st = new Stack<>(); // Creating a Stack:
        int res = 0, n = nums.length; // Variables
		// Filling the Stack in Decreasing Order:
        for (int i = 0; i < n; ++i)
            if (st.empty() || nums[st.peek()] > nums[i]) st.add(i);

		// Iterating the Array from the end:
        for (int i = n - 1; i > res; --i)
            while (!st.empty() && nums[st.peek()] <= nums[i])
                res = Math.max(res, i - st.pop());
        return res;
    }
}