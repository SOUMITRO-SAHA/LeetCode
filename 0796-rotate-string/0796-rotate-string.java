class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        
        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder(s);
            int targetIdx = 0;
            
            if(goal.charAt(0) == sb.charAt(i)){
                targetIdx = i;
                
                // Sub string
                String subStr = s.substring(0,targetIdx);
                
                // Delete the initial part:
                sb.delete(0, targetIdx);
                
                //Appending
                sb.append(subStr);
                
                // Checking for the match:
                if(goal.equals(sb.toString()))
                    return true;
            }
            
        }
        
        return false;
    }
}