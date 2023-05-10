class Solution {
    public String minWindow(String s, String t) {
        // First Creating a HashMap for t and store the frequencies of each characters:
        HashMap<Character, Integer> fqt = new HashMap<>();
        
        // Taking fq for T:
        for(char ch: t.toCharArray()){
            fqt.put(ch, fqt.getOrDefault(ch, 0)+1);
        }
        
        // getting required, desire length of characters:
        int required = t.length();
        int desire = 0;
        int sp = -1, ep = 0;
        String pans = "";
        
        // Second, Creating a HashMap for frequencies of the window:
        HashMap<Character, Integer> fqw = new HashMap<>();
        
        while(ep < s.length()){
            // Accuire
            char ch = s.charAt(ep);
            fqw.put(ch, fqw.getOrDefault(ch, 0)+1);
            
            // Checking for valid character to update desire
            if(fqw.getOrDefault(ch, 0) <= fqt.getOrDefault(ch, 0)) desire++;
            
            // Release and update pans:
            while(required == desire){
                String str = s.substring(sp+1, ep+1);
                if(pans.length() == 0 || pans.length() > str.length()){
                    pans = str;
                }
                // Now, Start Releasing:
                sp++;
                char c = s.charAt(sp);
                
                // Reduce the Frequency
                if(fqw.getOrDefault(c, 0) == 1) fqw.remove(c);
                else fqw.put(c, fqw.get(c)-1);
                
                // Checking whether important people removed from the current window or not:
                if(fqw.getOrDefault(c, 0) < fqt.getOrDefault(c, 0)) desire--;
            }
            
            ep++;
        }
        return pans;
    }
}