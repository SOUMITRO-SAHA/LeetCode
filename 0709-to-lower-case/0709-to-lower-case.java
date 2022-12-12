class Solution {
    public String toLowerCase(String s) {
        // Declaring an empty char Array:
        char[] ch = new char[s.length()];

        // Traversing through each char of the String:
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // Converting to Lower Case:
            if (currentChar >= 'A' && currentChar <= 'Z')
                currentChar = (char) (currentChar + 32);

            // Putting the char at Char Array:
            ch[i] = currentChar;
        }

        // Converting the Char Array to String:
        String res = new String(ch);

        // Answer:
        return res;
    }
}