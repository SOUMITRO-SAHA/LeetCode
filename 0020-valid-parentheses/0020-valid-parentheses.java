class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                if(st.size() == 0 || (st.size() > 0 && st.pop() != '('))
                    return false;
                continue;
            }
            else if(ch == '}'){
                if(st.size() == 0 || (st.size() > 0 && st.pop() != '{'))
                    return false;
                continue;
                
            }
            else if(ch == ']'){
                if(st.size() == 0 || (st.size() > 0 && st.pop() != '['))
                    return false;
                continue;
            }
            st.push(ch);
        }
        
        return st.size() == 0;
    }
}