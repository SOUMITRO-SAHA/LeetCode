## Brute-Force:
​
```java
// TC: O(N+M), SC: O(N)
public List<String> removeAnagrams(String[] words) {
List<String> res = new ArrayList<>();
// TC: O(N) => Length of the Words array:
String prevCode = "";
for(String w: words){
String code = getCode(w); // O(M)
if(!code.equals(prevCode)){
res.add(w);
}
prevCode = code;
}
return res;
}
// TC: O(M) => M length of the word:
// SC: O(M)
private String getCode(String s){
Map<Character, Integer> map = new TreeMap<>();
for(char ch: s.toCharArray()){
map.put(ch, map.getOrDefault(ch,0)+1);
}
StringBuilder sb = new StringBuilder();
for(char ch: map.keySet()){
sb.append(ch);
sb.append(map.get(ch));
}
return sb.toString();
}
```