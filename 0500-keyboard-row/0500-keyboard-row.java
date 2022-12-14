import java.util.regex.Pattern;
import java.util.ArrayList;

class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> str = new ArrayList<>();

        // Use a regular expression that matches all three patterns at once
        Pattern p = Pattern.compile("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*");

        for (String word : words) {
            String s = word.toLowerCase();
            if (p.matcher(s).matches()) {
                str.add(word);
            }
        }

        String res[] = str.toArray(new String[str.size()]); 
        return res;
    }
}