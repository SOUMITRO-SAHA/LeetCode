```java
class Solution {
public List<String> letterCombinations(String digits) {
String []ref = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
List<String> ans = new ArrayList<>();
getCombination("", digits, ref, ans);
// Removing ""
ans.remove("");
​
return ans;
}
public void getCombination(String p, String up, String []ref, List<String> ans){
// Base Case:
if(up.length() == 0){
ans.add(p);
return;
}
// Recursive Call:
char ch = up.charAt(0);
String currentString = ref[ch - '0'];
//        List<String> ans = new ArrayList<>();
​
for(int i = 0; i < currentString.length(); i++){
char cch = currentString.charAt(i); // 'a'
getCombination(p + cch, up.substring(1), ref, ans);
}
}
}
```