class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> st = new LinkedList<>();
        
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(st.size()>0 && st.peekLast() == ch){
                st.pollLast();
                continue;
            }
            st.addLast(ch);
        }
        
        StringBuilder sb = new StringBuilder();
        while(st.size() > 0){
            sb.append(st.pollFirst());
        }
        return sb.toString();
    }
}