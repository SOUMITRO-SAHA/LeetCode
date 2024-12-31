/**
 * @param {number[]} nums
 * @return {number}
 */
var pivotIndex = function(nums) {
    let totalSum = 0;
    let leftSum = 0;

    // First calculate the total sum
    nums.forEach(ele => totalSum += ele);

    // Now, calculate the leftSum and find the pivot Index
    for(let i=0; i<nums.length; i++){
        const rightSum = totalSum - leftSum - nums[i];
        if(leftSum === rightSum) return i;
        leftSum += nums[i];
    }

    return -1;
};