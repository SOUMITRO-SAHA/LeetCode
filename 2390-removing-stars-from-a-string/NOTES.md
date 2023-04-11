## Brute-Force Approach:
​
```java
class Solution {
// TC: O(n), SC:O(n)
public String removeStars(String s) {
Stack<Character> st = new Stack<>();
for(int i=0; i<s.length(); i++){
char ch = s.charAt(i);
if(ch == '*'){
if(st.size() > 0)st.pop();
continue;
}
st.push(ch);
}
StringBuilder sb = new StringBuilder();
while(st.size() > 0){
sb.append(st.pop());
}
return sb.reverse().toString();
}
}
```