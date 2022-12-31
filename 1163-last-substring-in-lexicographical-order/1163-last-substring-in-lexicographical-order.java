class Solution {
    public String lastSubstring(String s) {
        // Initialize the index of the maximum character to the last character of the string
        int maxIndex = s.length() - 1;

        // Iterate through the string backwards
        for(int currIndex = s.length() - 1 ; currIndex >= 0 ; currIndex--){
            // If the current character is greater than the maximum character, 
            // update the maximum character
            if(s.charAt(currIndex) > s.charAt(maxIndex))
                maxIndex = currIndex;

            // If the current character is equal to the maximum character, 
            // compare the characters after the current index
            else if(s.charAt(currIndex) == s.charAt(maxIndex)){
                int i = currIndex + 1;
                int j = maxIndex + 1;

                // Compare the characters after the current index until 
                // one of the indices reaches the maximum index or the end of the string
                while(i < maxIndex && j < s.length() && s.charAt(i) == s.charAt(j)){
                    i++;
                    j++;
                }

                // If the current index has a greater substring, update the maximum index
                if(i == maxIndex || j == s.length() || s.charAt(i) > s.charAt(j))
                    maxIndex = currIndex;
            }
        }

        // Return the substring starting from the maximum index
        return s.substring(maxIndex);
    }

}
