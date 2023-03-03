return null;
}
let len = countLL(head);
let temp = head;
if(len - n == 0)
return temp.next;
for(let i = 0; i<(len-n-1); i++){
temp = temp.next;
}
if(temp != null && temp.next != null){
temp.next = temp.next.next;
}
return head;
};
​
let countLL = (head) =>{
let c = 0;
let temp = head;
while(temp){
c++;
temp = temp.next;
}
return c;
}
```