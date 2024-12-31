class Solution {
    public static String cleanString(String s) {
        s = s.trim();

        StringBuilder sb = new StringBuilder();
        boolean isSpace = false;

        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                if (!isSpace) {
                    sb.append(ch);
                    isSpace = true;
                }
            } else {
                sb.append(ch);
                isSpace = false;
            }
        }

        return sb.toString();
    }
    
    public String reverseWords(String s) {
        String []arr = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i=arr.length - 1; i >=0; i--){
            String word = arr[i];
            if(word != " "){
                sb.append(word);
                sb.append(" ");
            }
        }

        return cleanString(sb.toString());
    }
}