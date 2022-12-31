# Brut-Force Approach:
```java
class Solution {
// Finds the last substring in the given string that starts with the maximum character
public String lastSubstring(String s) {
// Initialize the maximum character to be the smallest possible character
char maxChar='a';
int n = s.length();
// Initialize the result string to be an empty string
String res = "";
// Find the maximum character in the string
for(int i=0; i<n; i++){
char currentChar = s.charAt(i);
if(currentChar >= maxChar)
maxChar = currentChar;
}
// Find the last substring in the string that starts with the maximum character
for(int i=0; i<n; i++){
char currentChar = s.charAt(i);
if(currentChar == maxChar){
// Return the substring starting from the maximum character
res = s.substring(i);
break;
}
}
return res;
}
}
```