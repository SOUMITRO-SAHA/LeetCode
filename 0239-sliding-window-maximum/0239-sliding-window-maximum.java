class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
		int []ans = new int[n-k+1];
		int win = 0;

		// Creating a Stack Using Deque:
		// Stack: LIFO. So, addLast() & removeLast():
		Deque<Integer> dq = new ArrayDeque<>();

		// Iterating the Array:
		for(int i=0; i<n; i++){
			// If the Bottom Most element is out of the range of the Current Window then, remove it.
			while(dq.size()>0 && dq.peek() <= i -k){
				dq.removeFirst();
			}
			
			int ele = arr[i]; // Getting the Current element.
			
			// Checking the ngeri:
			// This will remove every elements that are smaller then current Element in the Deque:
			while (dq.size() > 0 && ele > arr[dq.getLast()]) {
                dq.removeLast();
            }
			
			// Adding the Element into the Stack:
			dq.addLast(i);

			// If the Current Index if out of the range of the Window, Then add the maximum value to the resultent array:
			if(i >= k -1){
				ans[win++] = arr[dq.peek()];
			}
		}

		return ans;
    }
}