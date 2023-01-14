class Solution {
    public int balancedStringSplit(String s) {
        int n = s.length();
        int cL = 0;
        int cR = 0;
        int maxCount = 0;
        for(int i=0; i<n; i++){
            char currentChar = s.charAt(i);
            if(currentChar == 'L') {
                cL++;
            }
            else if(currentChar == 'R'){
                cR++;
            }
            
            // Checking for each
            if(cL == cR){
                cL = cR = 0;
                maxCount++;
            }
        }
        
        return maxCount;
    }
}