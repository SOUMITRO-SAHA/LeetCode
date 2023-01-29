class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // Brut-Force:
        HashMap<Character, Integer> hash = new HashMap<>();
        // Taking the jewels into the HashMap:
        for (int i = 0; i < allowed.length(); i++) {
            char ch = allowed.charAt(i);
            if(hash.containsKey(ch)){
                hash.put(ch, hash.get(ch)+1);
            }
            else{
                hash.put(ch, 1);
            }
        }
        // Variable
        int count = 0;
        // Chacking Whether Consistent Strings or not:
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean isConsistent = true;
            // Checking each word:
            for (int j = 0; j < word.length(); j++) {
                char currentChar = word.charAt(j);
                if(!hash.containsKey(currentChar)){
                    isConsistent = false;
                }
            }
            // If consistent then
            if(isConsistent) count++;
        }
        return count;
    }
}