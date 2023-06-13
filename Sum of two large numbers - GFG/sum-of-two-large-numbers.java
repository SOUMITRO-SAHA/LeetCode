//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String x = read.readLine();
            String y = read.readLine();
            Solution ob = new Solution();
            String result = ob.findSum(x, y);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String findSum(String X, String Y) {
        StringBuilder res = new StringBuilder();
        
        StringBuilder x = new StringBuilder(X);
        StringBuilder y = new StringBuilder(Y);
        // Reversing the Numbers:
        x.reverse();
        y.reverse();
        
        // Performing the Addition:
        int i = 0;
        int rem = 0;
        while(i < x.length() && i < y.length()){
            char n1 = x.charAt(i);
            char n2 = y.charAt(i);
            
            int a = n1 - '0';
            int b = n2 - '0';

            int sum = a + b + rem;
            
            if(sum > 9){
                int last = sum % 10;
                res.append(last);
                rem = sum / 10;
            }
            else{
                rem = 0;
                res.append(sum);
            }
            
            i++;
        }
        while(i < x.length()){
            char n1 = x.charAt(i);
            
            int a = (n1 - '0');
            
            int sum = a + rem;
            
            if(sum > 9){
                int last = sum % 10;
                res.append(last);
                rem = sum / 10;
            }
            else{
                rem = 0;
                res.append(sum);
            }
            
            i++;
        }
        while(i < y.length()){
            char n2 = y.charAt(i);
            
            int b = (n2 - '0');
            
            int sum = b + rem;
            
            if(sum > 9){
                int last = sum % 10;
                res.append(last);
                rem = sum / 10;
            }
            else{
                rem = 0;
                res.append(sum);
            }
            
            i++;
        }
        
        // If still rem is not zero then add it to the res
        if(rem != 0) res.append(rem);
        
        // Now, I have to check for reading zeros:
        int j = res.length() -1;
        while (j > 0 && res.charAt(j) == '0') {
            res.deleteCharAt(j--);
        }
        
        // first reverse the ans, then return it
        return res.reverse().toString();
    }
}