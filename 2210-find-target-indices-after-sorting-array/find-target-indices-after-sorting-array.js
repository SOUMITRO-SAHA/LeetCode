/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var targetIndices = function (nums, target) {
  const sortedArray = nums.sort((a, b) => a - b);
  const ans = [];

  // -- Binary Search
  let st = 0;
  let end = nums.length - 1;
  while (st <= end) {
    const mid = st + Math.floor((end - st) / 2);
    const ele = sortedArray[mid];
    if (ele === target) {
      // Check for Left Position
      let left = sortedArray.indexOf(target);
      // Check for Right Position
      let right = sortedArray.lastIndexOf(target);

      const subArray = sortedArray.slice(left, right + 1);
      subArray.forEach((e) => {
        ans.push(left++);
      });

      break;
    } else if (ele > target) {
      end = mid - 1;
    } else {
      st = mid + 1;
    }
  }

  return ans;
};