class Solution {
    // Optimised Approach:
    // Using Stack:
    public int largestRectangleArea(int[] heights) {
        int area = 0;
        int len = heights.length;
        
        // Creating stack: Only stores the index;
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<len; i++){
            // Get the element
            int ele = heights[i];
            
            // Find the height greater then peek
            while(st.size()>0 && ele < heights[st.peek()]){
                int idx = st.pop();
                int rb = i;
                int lb = st.size() > 0? st.peek(): -1;
                
                int w = rb - lb -1;
                int h = heights[idx];
                int currArea = w * h;
                
                area = Math.max(currArea, area);
            }
            // Adding the height as potentia height
            st.push(i);
        }
        // If the Stack is still not emptied:
        while(st.size() > 0){
            int idx = st.pop();
            int rb = len;
            int lb = st.size() > 0? st.peek(): -1;

            int w = rb - lb -1;
            int h = heights[idx];
            int currArea = w * h;
            area = Math.max(currArea, area);
        }
        return area;
    }
}