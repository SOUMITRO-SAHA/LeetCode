class Solution {
    public String minWindow(String s, String t) {
        // Frequency count array for characters in t:
        int[] tCharCount = new int[128];

        // Counting the occurrences of each character in t
        for (char ch : t.toCharArray()) {
            tCharCount[ch]++;
        }

        // Pointers and variables for tracking the minimum window
        int start = 0; // Start index of the window
        int end = 0; // End index of the window
        int minStart = 0; // Start index of the minimum window
        int charCounter = t.length(); // Number of characters still needed to be found
        int minLen = Integer.MAX_VALUE; // Length of the minimum window

        // Sliding window approach
        while (end < s.length()) {
            char ch = s.charAt(end);

            if (tCharCount[ch] > 0) {
                charCounter--;
            }
            
            tCharCount[ch]--;

            while (charCounter == 0) {
                // Update the minimum window length and start index
                minLen = Math.min(end - start + 1, minLen);
                if (minLen == (end - start + 1)) {
                    minStart = start;
                }

                char currCh = s.charAt(start);
                tCharCount[currCh]++;
                if (tCharCount[currCh] > 0) {
                    charCounter++;
                }

                start++;
            }
            end++;
        }

        // Return the minimum window substring
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
