class Solution {
    public boolean isAnagram(String s, String t) {
        // Base Case: Checking the Length
        if(s.length() != t.length())
            return false;
        
        // Array
        char []ch1 = s.toCharArray();
        char []ch2 = t.toCharArray();
        
        // Sort
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        // Checking each char
        for(int i=0; i<ch1.length; i++){
            if(ch1[i] != ch2[i])
                return false;
        }
        
        return true;
    }
}