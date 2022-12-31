while(st < en){
if(baseStr.charAt(st) != baseStr.charAt(en)){
return false;
}
st++;
en--;
}
}
return true;
}
public static String changeBase(int n, int b){
StringBuilder sb = new StringBuilder();
// Finding the Base
while(n > 0){
int currRem = n % b;
sb.append(currRem);
n /= b;
}
return sb.toString();
}
public static void main(String[] args) {
int n = 4;
System.out.println(isStrictlyPalindromic(n));
}
}
```
​