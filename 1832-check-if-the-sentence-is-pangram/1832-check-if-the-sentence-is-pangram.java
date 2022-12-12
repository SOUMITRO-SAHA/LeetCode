class Solution {
    public boolean checkIfPangram(String sentence) {
        for (char i = 'a'; i <= 'z'; i++) {
            boolean isCharPresent = false;
            for (int j = 0; j < sentence.length(); j++) {
                char currentChar = sentence.charAt(j);
                // Checking the Case:
                if (currentChar >= 'A' && currentChar <= 'Z')
                    currentChar = (char) (currentChar + 32);

                if (currentChar == i)
                    isCharPresent = true;
            }
            if (!isCharPresent)
                return false;
        }
        return true;
    }
}