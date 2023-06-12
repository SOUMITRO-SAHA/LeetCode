class Solution {
    // Two-Pointer Approach:
    public int maxArea(int[] height) {
        int len =  height.length;
        int si = 0, ei = len-1;
        int area = 0;
        while(si < ei){
            int w = ei - si;
            int h = Math.min(height[si], height[ei]);
            int currArea = w * h;
            area = Math.max(area, currArea);
            
            // Now, update the pointers
            if(height[si] <= height[ei]){
                si++;
            }
            else ei--;
        }
        return area;
    }
}