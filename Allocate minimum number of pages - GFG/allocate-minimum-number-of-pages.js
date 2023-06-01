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
        let a = new Array(n);
        let input_ar1 = readLine().split(' ').map(x=>parseInt(x));
        for(let i=0;i<n;i++)
            a[i] = input_ar1[i];
        let m = parseInt(readLine());
        let obj = new Solution();
        console.log(obj.findPages(a, n, m));
        
    }
}
// } Driver Code Ends


//User function Template for javascript

/**
 * @param {number[]} a
 * @param {number} n
 * @param {number} m
 * @returns {number}
*/

class Solution{
    //Function to find minimum number of pages.
    findPages(arr, n, m){
        // Edge Case:
        if(m > n) return -1;
        let max = Number.MIN_SAFE_INTEGER;
        let sum = 0;
        arr.forEach((el) => {
            max = Math.max(max, el);
            sum += el;
        });
        
        if(n == m) return max;
        // Now, Binary Search to find the range:
        let si = max, ei = sum, pans = 0;
        while(si<=ei){
            let mid = Math.floor(si + (ei-si)/2);
            if(this.isPossible(arr, mid, m)){
                // go left most to find the smallest range
                pans = mid;
                ei = mid -1;
            }
            else{
                // go right to find the minimum possible range
                si = mid +1;
            }
        }
        return pans;
    }
    isPossible(arr, mid, std){
        let student = 1, pages = 0;
        
        arr.forEach((el)=>{
            let currSum = pages + el;
            if(currSum <= mid)
                pages = currSum;
            else{
                student++;
                pages = el;
            }
        })
        
        return student <= std;
    }
}
















