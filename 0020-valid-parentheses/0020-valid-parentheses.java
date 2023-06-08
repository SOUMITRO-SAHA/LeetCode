class Solution {
    // I have to use Stack
    public boolean isValid(String s) {
        // Edge Case:
        if(s.length() == 1) return false;
        
        // Creating a Stack:
        Stack<Character> st = new Stack<>();
        
        // Putthing all the Opening paranthesis into the Stack:
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                // Put into the Stack:
                st.push(ch);
            }
            else{
                if(st.size() > 0 && ch == ')' && st.peek() == '(') st.pop();
                else if(st.size() > 0 && ch =='}' && st.peek() == '{') st.pop();
                else if(st.size() > 0 && ch == ']' && st.peek() == '[') st.pop();
                else return false;
            }
        }
        
        return st.isEmpty();
    }
}