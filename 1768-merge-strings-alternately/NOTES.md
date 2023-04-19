#### Brute-Force Approach:
​
```python
class Solution:
# TC: O(n^2), SC: O(n+m) || String Concat takes n^2:
# Brute-Force Approach:
def mergeAlternately(self, word1: str, word2: str) -> str:
res = ""
i = 0
while(i < len(word1) and i < len(word2)):
res += word1[i]+word2[i]
i += 1
while len(word1) > len(word2) and i != len(word1):
res += word1[i]
i += 1
while len(word2) > len(word1) and i != len(word2):
res += word2[i]
i += 1
return res
``