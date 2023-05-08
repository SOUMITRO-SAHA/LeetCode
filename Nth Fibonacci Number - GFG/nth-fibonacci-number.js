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
    let i = 0;
    for(;i<t;i++)
    {
        let n = parseInt(readLine());
        let obj = new Solution();
        console.log(obj.nthFibonacci(n));
        
    }
}

// } Driver Code Ends


//User function Template for javascript

/**
 * @param {number} n
 * @returns {number}
*/

class Solution {
    // Iterative Approach:
    nthFibonacci(n){
        const arr = [0, 1];
        
        let res = 0;
        let mod = 1000000007;
        // Edge Case:
        if(n == 0 || n == 1) return arr[n];
        
        for(let i=2; i<=n; i++){
            res = arr[i-1]%mod + arr[i-2]%mod;
            
            arr.push(res);
        }
        
        return res%mod;
    }
}