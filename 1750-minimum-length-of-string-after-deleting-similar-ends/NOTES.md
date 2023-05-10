### Brute-Force:
​
```java
// Brute-Force: Using Deque:
// TC: O(n): SC: O(n)
public int minimumLength(String s) {
// Using Deque:
Deque<Character> dq = new ArrayDeque<>();
​
// Filling the dq with each characters:
for(char ch: s.toCharArray()){
dq.addLast(ch);
}
​
// Now, iterating till I found different Ended String:
while(dq.size() != 0){
if(dq.size() == 1) break;
// Codition-1: if first and last character are same:
char ch1 = dq.getFirst();
char ch2 = dq.getLast();
if(ch1 == ch2){
while(dq.size() != 0 && ch1 == dq.getFirst() ) dq.removeFirst();
while(dq.size() != 0 && ch2 == dq.getLast() ) dq.removeLast();
}
​
// Whenever the first char and last char are different break:
if(dq.size() > 0 && dq.getFirst() != dq.getLast()) break;
}
​
return dq.size();
}
```