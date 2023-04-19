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
```
#### Better Approach
```python
class Solution:
def mergeAlternately(self, word1: str, word2: str) -> str:
res = [] # Creating an empty array
i = 0
while i < len(word1) or i < len(word2):
if(i<len(word1)):
res.append(word1[i])
if(i<len(word2)):
res.append(word2[i])
i += 1
return ''.join(res) # O(n) || Joining each word to the '' takes O(n) n = size of the array.
```