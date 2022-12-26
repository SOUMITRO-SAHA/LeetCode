import java.util.*;
class Solution {
    void swap(int []arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public int maximumSwap(int num) {
        String s = Integer.toString(num);
        
        // If the length of the arr == n; then Space-Complexity will be 0(n);
        // Array:
        int []arr = new int[s.length()]; 
        int n = arr.length;
        int []li = new int[10];
        
        // Taking the Numbers into the Arr[]:
        for(int i=0; i<n; i++){
            arr[i] = s.charAt(i) -'0';
        }
        
        // Preparing the Frequency Array: to maintain the last index of the numbers
        for(int i=0; i<n; i++){
            int digit = arr[i];
            li[digit] = i;
        }
        
        // Preparing for the swap if codition meets:
        boolean flag = false;
        for(int i=0; i<n; i++){
            int digit = arr[i];
            for(int j = 9; j > digit; j--){ // this can't effect the time-complexity:
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