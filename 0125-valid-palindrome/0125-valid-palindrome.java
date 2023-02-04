class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> res = new ArrayList<>();
        
        // Taking the Alphanumeric chars
        for(int i=0; i<s.length(); i++){
            char currChar = s.charAt(i);
            if(currChar >= 'A' && currChar <= 'Z'){
                currChar = (char)(currChar + 32);
            }
            
            // Checking for Alphanumeric
            if(currChar >= 'a' && currChar <='z' 
               || currChar >='0' && currChar <= '9'){
                res.add(currChar);
            }
        }
        
        
        // Checking for Palindrome
        int i = 0;
        int j = res.size() -1;
        while(i < j){
            if(res.get(i) != res.get(j)) return false;
            i++;
            j--;
        }
        
        return true;
    }
}