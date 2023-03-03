}
```
​
---
## JavaScript:
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
* @return {number}
*/
var getDecimalValue = function(head) {
let temp = head
let str = ""; // String
while(temp){
str += temp.val; // Taking the Node val's into String.
temp = temp.next;
}
return parseInt(str, 2); // Converting the String to Decimal.
};
```