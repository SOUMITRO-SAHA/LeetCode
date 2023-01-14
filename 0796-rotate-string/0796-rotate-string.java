class Solution {
    public boolean rotateString(String s, String goal) {
        // Edge Case:
        if(s.length() != goal.length())
        return false;
        
        int targetIdx = 0;
        // Finding the index of char in s 
        for(int i=0; i<s.length(); i++){
            // Assigning the s to Sb:
            StringBuilder sb = new StringBuilder(s);
            if(s.charAt(i) == goal.charAt(0)){
                targetIdx = i;

                // Each time when the Char find :
                // Now finding the Sub-String:
                String firstHalfStr = s.substring(0,targetIdx);
                
                // Deleting the First Part till targetIdx
                sb.delete(0,targetIdx);
                
                // Appending the substring to the sb:
                sb.append(firstHalfStr);
                
                // Checking for the match
                if(goal.equals(sb.toString())){
                    return true;
                }
            }
        }
        
        // If not matched then;
        return false;
    }
}