/**
 * @param {string[]} operations
 * @return {number}
 */
var finalValueAfterOperations = function(op) {
    let ans = 0;
    
    op.forEach((str)=> {
        if(str === "++X" || str === "X++") ans++;
        if(str === "--X" || str === "X--") ans--;
    })
    return ans;
};