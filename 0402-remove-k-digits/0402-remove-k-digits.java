class Solution {
    public String removeKdigits(String s, int k) {
        if(k == s.length()) return "0";
        
        // Stack to store the digits
        Stack<Character> st = new Stack<>();
        int slen = s.length();
        
        for(int i=0; i<slen; i++){
            // get element
            char ch = s.charAt(i);
            // check with the peek
            while(k > 0 && st.size() > 0 && ch < st.peek()){
                st.pop();
                k--;
            }
            // push the current element into the stack
            st.push(ch);
        }
        
        // Remove remaining digits if k > 0
        while(k > 0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        
        // Build the result string
        StringBuilder sb = new StringBuilder();
        
        // Append digits from the stack in reverse order
        while(st.size() > 0){
            sb.append(st.pop());
        }
        
        // Reversing the result string to get the correct order
        sb.reverse();
        
        // Removing the leading zeros:
        while(sb.toString().startsWith("0")){
            sb.deleteCharAt(0);
        }
        
        // If the result is empty, return '0', else return the result
        return sb.length() == 0? "0": sb.toString();
    }
}