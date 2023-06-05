class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int window = 0;
        int []res = new int[n-k+1]; // The resultent array size will be (total_ele - target_window_size +1);
        
        // Creating a Stack using Deque
        Deque<Integer> dq = new LinkedList<>(); // I will take the indexs into the stack
        
        // Task-1: If I found any greater element then I will add it to the last
        // and, remove all the elements that are smaller then the current element from the last
        // Task-2: If I pass the current window size then I have to remove the element from the Stack
        // Task-3: I have to take each greater element in the current window after I acheve the required window size.
        for(int i=0; i<n; i++){
            // I have to check each time whether any element into the stack is not belongs to the current window
            while(dq.size() > 0 && dq.getFirst() <= i - k) dq.removeFirst();
            
            // Current element
            int ele = nums[i];
            
            // Before taking the new element into the Stack I have to remove all the elements that are smaller then
            // The current element
            while(dq.size() > 0 && ele > nums[dq.getLast()]) dq.removeLast();
            dq.addLast(i);
            
            // Now, I have to check whether I achieved the required window size:
            if(i >= k-1){
                res[window++] = nums[dq.getFirst()];
            }
        }
        
        return res;
    }
}