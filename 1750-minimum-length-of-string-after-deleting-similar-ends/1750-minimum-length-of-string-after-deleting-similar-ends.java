class Solution {
    // Brute-Force Solution is in Notes:
    // Optimized Approach: Using Two Pointers:
    // TC: O(n); SC: O(1)
    public int minimumLength(String s) {
        int sp = 0;
        int ep = s.length() -1;
        
        // Edge Case:
        if(sp == ep) return 1;
        
        while(sp < ep){
            // Checking whether first == last:
            if(s.charAt(sp) != s.charAt(ep)) break;
            
            char ch = s.charAt(sp);
            while(sp < ep && s.charAt(sp) == ch) sp++;
            while(sp < ep && s.charAt(ep) == ch) ep--;
            
        }
        
        // Special Condition:
        if(sp == ep){
            if(sp != 0 && ep != s.length() -1){
                // then Check for their neighbours:
                char currChar = s.charAt(sp);
                if(currChar != s.charAt(sp -1) && currChar != s.charAt(ep+1)) return 1;
            }
        }
        
        return (sp < ep)?ep - sp + 1: 0;
    }
}