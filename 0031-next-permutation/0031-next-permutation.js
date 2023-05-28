/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var nextPermutation = function(nums) {
    const swap = (arr, a, b) => {
        const temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    // Step-1: Finding the Break Point:
    let idx = -1, len = nums.length;
    for(let i=len-2; i>=0; i--){
        if(nums[i] < nums[i+1]){
            idx = i;
            break;
        }
    }
    if(idx == -1){
        nums.reverse();
        return;
    } 
    
    // Step-2: Finding the just greater element to the right from the current element at idx
    for(let i=len-1; i>=0; i--){
        if(nums[i] > nums[idx]){
            // Swap
            swap(nums, i, idx);
            // Break
            break;
        }
    }
    
    // Step-3: Reversing the rest of the array:\
    const subArray = nums.slice(idx+1);
    subArray.reverse();
    nums.splice(idx+1, subArray.length, ...subArray);
};