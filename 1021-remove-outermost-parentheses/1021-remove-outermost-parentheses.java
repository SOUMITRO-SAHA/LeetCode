class Solution {
    public String removeOuterParentheses(String s) {
        int len = s.length();
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<len; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                // Step 1: Check
                // Step 2: Push
                if(st.size() > 0){
                    sb.append(ch);
                }
                st.push(ch);
            }
            else{
                // Step 1: Remove
                // Step 2: Check
                st.pop();
                if(st.size() > 0){
                    sb.append(ch);
                }
            }
        }
        
        // Returning:
        return sb.toString();
    }
}