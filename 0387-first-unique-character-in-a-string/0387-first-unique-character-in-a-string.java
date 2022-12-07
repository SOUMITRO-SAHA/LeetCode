import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        char targetChar = 0;
        Hashtable<Character, Integer> m = new Hashtable<>();

        // Putting the Characters of the String in the HashMap
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (m.containsKey(currentChar)) {
                m.put(currentChar, m.get(currentChar) + 1);
            } else {
                m.put(currentChar, 1);
            }
        }
        
        // Finding the Index of the Target Character
        for (int i = 0; i < s.length(); i++) {
            if (m.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}