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

function printList(res,n){
    let s="";
    for(let i=0;i<n;i++){
        s+=res[i];
        s+=" ";
    }
    console.log(s);
}


function main() {
    let t = parseInt(readLine());
    let i = 0;
    for(;i<t;i++)
    {
        let n = parseInt(readLine());
        let obj = new Solution();
        obj.printTillN(n);
        
    }
}// } Driver Code Ends





// } Driver Code Ends


//User function Template for javascript


/**
 * @param {number} n
 * @returns {void}
*/

class Solution{
    constructor(){
        this.str = '';
    }
    
    recursiveCall(n){
        // Base Case:
        if(n == 0) return;
        
        // Recursive Call:
        this.recursiveCall(n-1);
        
        // Work:
        this.str += `${n} `;
    }
    printTillN(n){
        this.recursiveCall(n);
        console.log(this.str);
    }
}



