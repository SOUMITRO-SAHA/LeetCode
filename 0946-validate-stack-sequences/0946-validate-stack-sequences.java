class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int p = 0;
        for(int el : pushed){
            // Pushing into the Stack:
            st.push(el);
            // Checking for the peek() element whether it is equal to the element of popped
            // element:
            while(st.size() > 0 && st.peek() == popped[p]){
                st.pop();
                p++;
            }
        }
        
        return st.size() == 0;
    }
}