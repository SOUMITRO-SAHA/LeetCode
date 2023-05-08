/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const map = new Map(); // {key: element, value: index}
    
    // Mapping the elements with it's index:
    for(let i=0; i<nums.length; i++){
        map.set(nums[i], i);
    }
    
    // Checking for the Complement:
    for(let i=0; i<nums.length; i++){
        let complement = target - nums[i];
        
        // Checking into the Map:
        if(map.has(complement) && map.get(complement) != i)
            return [i, map.get(complement)];
    }
};