/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var searchRange = function(nums, target) {
    const arr = [-1, -1];
    let st = 0;
    let end = nums.length - 1;

    while(st <= end){
        const mid = st + Math.floor((end - st)/2);
        const ele = nums[mid];

        if(ele === target){
            // Looking for Left Occurance
            // Looking for Right Occurance
            let left = mid;
            let right = mid;
            while(left > 0 && nums[left] === target){
                left--;
            }

            while(right < nums.length && nums[right] === target){
                right++;
            }

            arr[0] = left === 0 && nums[left] === target    ? left : left + 1;
            arr[1] = right === 0 && nums[right] === target  ? right : right - 1;

            break;
        } else if(ele > target){
            end = mid - 1;
        } else {
            st = mid + 1;
        }
    }

    return arr;
};