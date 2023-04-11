class Solution {
    public boolean backspaceCompare(String s, String t) {
        String str1 = getOriginalStr(s);
        String str2 = getOriginalStr(t);
        
        return str1.equals(str2);
    }
    private String getOriginalStr(String s){
        int len = s.length();
        
        Deque<Character> st = new LinkedList<>();
        
        for(int i=0; i<len; i++){
            char ch = s.charAt(i);
            if(ch == '#'){
                if(st.size() > 0)st.pollLast();
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