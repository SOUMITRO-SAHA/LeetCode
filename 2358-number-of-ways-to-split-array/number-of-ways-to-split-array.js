/**
 * @param {number[]} nums
 * @return {number}
 */
var waysToSplitArray = function (nums) {
  // Finding the Total Sum of all the numbers
  let prefixSum = nums.reduce((acc, current) => {
    return (acc += current);
  });

  let currentSum = 0;
  let validSplit = 0;
  // Finding the Pivot Point
  for (let i = 0; i < nums.length - 1; i++) {
    const ele = nums[i];
    currentSum += ele;
    prefixSum -= ele;

    if (currentSum >= prefixSum) {
      validSplit++;
    }
  }

  return validSplit;
};