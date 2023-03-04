## Java
### Optimised Approach:
```java
class Solution {
public boolean isPalindrome(ListNode head) {
if (head == null || head.next == null) {
return true;
}
​
// Find the middle node using two pointers
ListNode slow = head;
ListNode fast = head;
while (fast.next != null && fast.next.next != null) {
slow = slow.next;
fast = fast.next.next;
}
​
// Reverse the second half of the linked list using recursion
ListNode secondHalf = reverse(slow.next);
ListNode firstHalf = head;
​
// Compare the elements of the first half and the second half
while (secondHalf != null) {
if (firstHalf.val != secondHalf.val) {
return false;
}
firstHalf = firstHalf.next;
secondHalf = secondHalf.next;
}
​
return true;
}
​
// Helper method to reverse a linked list using recursion
private ListNode reverse(ListNode head) {
if (head == null || head.next == null) {
return head;
}
ListNode reversedList = reverse(head.next);
head.next.next = head;
head.next = null;
return reversedList;
}
}
​
```
​
---
### My Solution:
​
```java
/**
* Definition for singly-linked list.
* public class ListNode {