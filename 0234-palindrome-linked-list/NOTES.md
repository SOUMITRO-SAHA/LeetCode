// Dividing the LL into Two Parts:
let firstHalf = head;
let secondHalf = reverseLL(slow);
while(secondHalf){
if(firstHalf.val != secondHalf.val)
return false;
// Next node:
firstHalf = firstHalf.next;
secondHalf = secondHalf.next;
}
return true;
};
​
let reverseLL = (head) => {
let curr = head;
let prev = null;
while(curr){
let nextNode = curr.next;
curr.next = prev;
prev = curr;
curr = nextNode;
}
return prev;
}
```