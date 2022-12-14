​
### Complexity Analysis :
The time complexity of the findWords() method depends on the number of words in the words array and the average length of the words in the array.
​
The first line of the method, ArrayList<String> str = new ArrayList<>();, has a time complexity of O(1), as it creates a new ArrayList object without doing any additional processing.
​
The for loop, for (String word : words), has a time complexity of O(n), where n is the number of words in the words array.
​
The String s = word.toLowerCase(); line has a time complexity of O(m), where m is the average length of the words in the words array.
​
The if statement, if (s.matches("[qwertyuiop]*") || s.matches("[asdfghjkl]*") || s.matches("[zxcvbnm]*")), has a time complexity of O(m), as it uses the matches() method, which has a time complexity of O(m) for a string of length m.
​
The str.add(word); line has a time complexity of O(1), as it simply adds an element to the ArrayList without any additional processing.
​
Finally, the String res[] = str.toArray(new String[str.size()]); and return res; lines have a time complexity of O(n), as they convert the ArrayList to an array and return it.
​
Overall, the time complexity of the findWords() method is O(n * m), as it has to process each word in the words array, and the time complexity of each word is proportional to its length.
​
---
​
# Optimization:
```java
import java.util.regex.Pattern;
import java.util.ArrayList;
​
class Solution {
public String[] findWords(String[] words) {
ArrayList<String> str = new ArrayList<>();
​
// Use a regular expression that matches all three patterns at once
Pattern p = Pattern.compile("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*");
​
for (String word : words) {
String s = word.toLowerCase();
if (p.matcher(s).matches()) {
str.add(word);
}
}
​
String res[] = str.toArray(new String[str.size()]);
return res;
}
}
```