class Solution {
    // TC: O(n+m)
    // SC: O(n)
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        // Edge Case:
        if(strs.length == 0){
            List<String> a = new ArrayList<>();
            a.add("");
            ans.add(a);
            return ans;
        }
        if(strs.length == 1){
            List<String> a = new ArrayList<>();
            a.add(strs[0]);
            ans.add(a);
            return ans;
        }
        // Other Case:
        // SC: Store 'n' or less different element, and arrayList size:
        HashMap<String, ArrayList<String>> h = new HashMap<>();
        
        //Iterating the Given String Array:
        for(String str : strs){ // TC: length of array[let n]
            // Get the Code:
            String code = getCode(str); // TC: len of each string[Let max len is 'm']
            
            // If present the add the str to the ArrayList, else
            // crease another Str key:
            if(h.containsKey(code)){
                h.get(code).add(str);
            }
            else{
                ArrayList<String> res = new ArrayList<>();
                res.add(str);
                h.put(code, res);
            }
        }
        
        // Putting the Results into the ans:
        for(var set : h.keySet()){
            ans.add(h.get(set));
        }
        
        return ans;
    }
    
    // TC: (1), SC: O(1)
    private String getCode(String str){
        // It will Only Sotre 26 Characters so 
        // SC: O(1)
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Putting the Frequency into the HashTable:
        for(char s : str.toCharArray()){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        
        // Foumulate the Unique Code:
        StringBuilder sb = new StringBuilder();
        // Only run for 26 characters so TC: O(1)
        for(char i = 'a'; i<='z'; i++){
            if(map.containsKey(i)){
                int count = map.get(i);
                sb.append(i);
                sb.append(count);
            }
        }
        
        return sb.toString();
    }
}