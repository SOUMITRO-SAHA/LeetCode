class Solution {
    public List<String> letterCombinations(String digits) {
        // Edge Case:
        if(digits == ""){
            return new ArrayList<>();
        }
        
        String []ref = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = getCombination("", digits, ref);
        
        // Removing ""
        result.remove("");
        
        return result;
    }
    public List<String> getCombination(String p, String up, String []ref){
        // Base Case:
        if(up.length() == 0){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        // Recursive Call:
        char ch = up.charAt(0);
        String currentString = ref[ch - '0'];
        List<String> ans = new ArrayList<>();

        for(int i = 0; i < currentString.length(); i++){
            char cch = currentString.charAt(i); // 'a'
            List<String> smaller = getCombination(p + cch, up.substring(1), ref);
            ans.addAll(smaller);
        }

        return ans;
    }
}