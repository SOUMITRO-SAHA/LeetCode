class Solution {
    // TC: O(n), SC:O(n)
    public String removeStars(String s) {
        // Implementing a Stack Using Deque:
        Deque<Character> st = new LinkedList<>();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '*'){
                if(st.size() > 0)st.removeLast();
                continue;
            }
            st.addLast(ch);
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(st.size() > 0){
            sb.append(st.removeFirst());
        }
        
        return sb.toString();
    }
}