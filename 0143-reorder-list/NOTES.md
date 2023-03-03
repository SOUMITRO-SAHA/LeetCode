ls = t1;
t1 = t1.next;
ls.next = t2;
ls = t2;
t2 = t2.next;
}
// If any LL left:
if(t1 != null){
ls.next = t1;
}
else if(t2 != null){
ls.next = t2;
}
}
public ListNode reverseLL(ListNode head){
ListNode curr = head;
ListNode prev = null;
while(curr != null){
ListNode nextNode = curr.next;
curr.next = prev;
prev = curr;
curr = nextNode;
}
return prev;
}
}
```
​
---
​
## JavaScript :
​
```javascript
/**
* Definition for singly-linked list.
* function ListNode(val, next) {
*     this.val = (val===undefined ? 0 : val)
*     this.next = (next===undefined ? null : next)
* }
*/
/**
* @param {ListNode} head
* @return {void} Do not return anything, modify head in-place instead.
*/
var reorderList = function(head) {
let fast = head;
let slow = head;
// Finding the middle Node:
while(fast && fast.next){
fast = fast.next.next;
slow = slow.next;
}