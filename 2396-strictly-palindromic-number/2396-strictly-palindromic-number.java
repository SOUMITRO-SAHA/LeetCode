class Solution {
    public static boolean isStrictlyPalindromic(int n){
        for(int i=2; i<= n-2; i++){
    		String baseStr = changeBase(n, i);
            int st = 0; 
            int en = baseStr.length() -1;
            // Checking for Palindromic:
    		while(st < en){
    		    if(baseStr.charAt(st) != baseStr.charAt(en)){
    		        return false;
    		    }
    		    st++;
    		    en--;
    		}
        }
		
		return true;
    }
    public static String changeBase(int n, int b){
        StringBuilder sb = new StringBuilder();
        // Finding the Base
        while(n > 0){
            int currRem = n % b;
            sb.append(currRem);
            n /= b;
        }
        
        return sb.toString();
    }
}