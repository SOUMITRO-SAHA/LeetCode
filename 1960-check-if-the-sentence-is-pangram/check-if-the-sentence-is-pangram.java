class Solution {
    public boolean checkIfPangram(String sentence) {
        String lower = sentence.toLowerCase();
        
        for(char ch = 'a'; ch <= 'z'; ch++){
            if(!lower.contains(String.valueOf(ch))) return false;
        }

        return true;
    }
}