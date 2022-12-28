class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() -1;
        int j = i;
        while(i >= 0){
            // Position Variable:
            int p = 0;
            // Skipping the Empty Spaces:
            while(i >= 0 && s.charAt(i) == ' ')
                i--;
            j = i;

            // If it is a word
            while(j >= 0 && s.charAt(j) !=' '){
                j--;
            }
            // Assigning the P = j
            p = j +1;

            // Taking the Word in to the Char [];
            while(p <= i){
                sb.append(s.charAt(p++));
            }

            // After every Word Take Space as well
            if(p != 0)
                sb.append(' ');

            // Reassigning the i
            i = j;
        }

        // Emptying the last Space in the Char Array:
        if(sb.charAt(sb.length() -1) == ' '){
            sb.deleteCharAt(sb.length() -1);
        }

        return sb.toString();
    }
}