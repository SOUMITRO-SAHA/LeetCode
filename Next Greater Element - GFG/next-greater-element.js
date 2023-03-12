//{ Driver Code Starts
//Initial Template for javascript
'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}

function main() {
    let t = parseInt(readLine());
    for(let i=0;i<t;i++)
    {
        let input_line = readLine().split(' ');
        let n = parseInt(input_line[0]);
    
        input_line = readLine().split(' ');
        let arr = new Array(n);
        for(let i=0;i<n;i++){
            arr[i] = BigInt(input_line[i]);
        }
        let obj = new Solution();
        let ans = obj.nextLargerElement(arr, n);
        let s="";
        for(let i=0;i<ans.length;i++)
        {
            if(ans[i]==BigInt(-0))
                ans[i]=BigInt(0);
            s+=ans[i];
            s+=" ";
        }
        console.log(s);
    }
}

// } Driver Code Ends


//User function Template for javascript

/**
 * @param {BigInt[]} arr
 * @param {number} n
 * @returns {BigInt[]}
*/
class Solution
{
    //Function to find the next greater element for each element of the array.
    // Overall :
    // TC : O(n)
    // SC : O(n)
    nextLargerElement(arr, n)
    {
        // Creating a stack, it will store the potential larger element
        // SC : O(n) -> Worst Case:
        const stack = [];
        
        // answer array
        // SC : O(n) -> Best Case:
        const ans = [];
        
        // Iteraring from the right to left:
        // O(n)
        for(let i = n-1; i>=0; i--){
            let ele = arr[i];
            
            // Checking in the stack for the potential learger element
            while(stack.length > 0 && stack[stack.length -1] <= ele){
                stack.pop(); // Removing the element
            }
            
            // Getting the larger element in to the ans array
            if(stack.length > 0){
                ans.push(stack[stack.length -1]);
            }
            else{
                ans.push(-1);
            }
            
            // adding the current element to the stack
            stack.push(ele);
        }
        
        // Getting the ans
        ans.reverse(); // TC : O(n)
        
        return ans;
        
    }
}