// TC: O(n^3) | SC: O(1)
/*
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            for (int len = 1; len <= n - i; len += 2) {
                int subarraySum = 0;
                for (int j = i; j < i + len; j++) {
                    subarraySum += arr[j];
                }
                sum += subarraySum;
            }
        }
        
        return sum;
    }
}
*/
// TC: O(n) | SC: O(1)

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            int start = i + 1;
            int end = n - i;
            int total = start * end;
            int odd = total /2 ;
            if(total % 2 != 0) odd++;
            sum += odd * arr[i];
        }
        
        return sum;
    }
}
