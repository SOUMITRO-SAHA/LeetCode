class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> str = new ArrayList<>();
        int idx = 0;

        for (String word : words) {
            String s = word.toLowerCase();
            if (s.matches("[qwertyuiop]*") || s.matches("[asdfghjkl]*")
			  || s.matches("[zxcvbnm]*")) {
                str.add(word);
            }

        }
        String res[] = str.toArray(new String[str.size()]); 
        return res;
    }
}