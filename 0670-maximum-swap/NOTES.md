// Preparing for the swap if codition meets:
boolean flag = false;
for(int i=0; i<n; i++){
int digit = arr[i];
for(int j = 9; j > digit; j--){
if(i < li[j]){
// Swap and break: also update the flag;
swap(arr, i, li[j]);
flag = true;
break;
}
}
if(flag) //If already swap happend:
break;
}
// Converting the arr to the number again:
int ans = 0;
for(int i=0; i<n; i++){
ans = ans * 10 + arr[i];
}
// Returning the Ans:
return ans;
}
}
```
---
Vide Solution: [PrepCoding](https://www.youtube.com/watch?v=IiAd7twX0xU&ab_channel=Pepcoding)