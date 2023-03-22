/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraysDivByK = function(nums, k) {
    // Creating a HashMap:
    // [Key, Value] = [Integer, Integer]
    const map = new Map();
    
    // Putting the first value as (0,1)
    map.set(0,1);
    
    // Variables:
    let sum = 0;
    let ans = 0;
    
    // Iterating the given array:
    for(let el of nums){
        sum += el;
        // Finding the Remainder:
        let rem = sum % k;
        
        // Checking whether the value of rem < 0
        if(rem < 0)
            rem += k;
        
        // Checking if the element is present in the HM or not
        if(map.has(rem)){
            ans += map.get(rem);
            map.set(rem, map.get(rem)+1);
        }
        else{
            map.set(rem, 1);
        }
    }
    
    return ans;
};