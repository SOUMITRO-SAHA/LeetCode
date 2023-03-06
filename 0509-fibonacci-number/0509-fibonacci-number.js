/**
 * @param {number} n
 * @return {number}
 */
var fib = function(n) {
    // Fib = fib(n-1) + fib(n-2);
    // Base Case:
    if(n == 0 || n == 1)
        return n;
    
    return fib(n-1) + fib(n-2);
};