class Solution {
    public int mostWordsFound(String[] sentences) {
        // Brut Force:
        int maxLength = 0;
        for (int i = 0; i < sentences.length; i++) {
            String []currentString = sentences[i].split(" ");
            maxLength = Math.max(maxLength, currentString.length);
        }

        return maxLength;
    }
}