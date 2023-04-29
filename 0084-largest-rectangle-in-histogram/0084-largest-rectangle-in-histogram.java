class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int maxArea = 0;
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<n; i++){
            int ele = arr[i];
            while(st.size() > 0 && ele < arr[st.peek()]){
                int idx = st.pop();
                int rb = i;
                int lb = (st.size() > 0)?st.peek(): -1;
                
                int width = rb - lb -1;
                int height = arr[idx];
                
                int currArea = width * height;
                maxArea = Math.max(maxArea, currArea);        
            }
            st.push(i);
        }
        
        while(st.size() >0){
            int idx = st.pop();
            int rb = n;
            int lb = (st.size() > 0)?st.peek(): -1;

            int width = rb - lb -1;
            int height = arr[idx];

            int currArea = width * height;
            maxArea = Math.max(maxArea, currArea);
        }
        
        return maxArea;
    }
}