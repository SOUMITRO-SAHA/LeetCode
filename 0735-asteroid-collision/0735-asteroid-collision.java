class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // Creating a Stack
		Stack<Integer> st = new Stack<>();

		// Iterate the loop:
		for(int as: asteroids){
			if(as > 0){
				// Push to the Stack
				st.push(as);
			}
			else{
				// First Condition: till the previous ast's are smaller then current ast
				while(st.size() != 0 && st.peek() > 0 && st.peek() < -as){
					st.pop();
				}
				// If both are equal
				if(st.size() != 0 && st.peek() == -as){
					st.pop();
				}
				// if current ast is larger
				else if(st.size() != 0 && st.peek() > -as){}
				else {
					st.push(as);
				}
			}
		}

		// Now, I am having the remaining or survived astroids on the stack:
		int []res = new int[st.size()];
		int i = res.length -1;
		while(i >= 0){
			res[i--] = st.pop();
		}

		return res;
    }
}