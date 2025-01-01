/**
 * @param {string} s
 * @return {number}
 */
var maxScore = function (s) {
  let max = 0;

  for (let i = 1; i < s.length; i++) {
    const left = s.slice(0, i);
    const right = s.slice(i, s.length);

    let leftCount = 0;
    let rightCount = 0;

    if (left) {
      leftCount = getMatchCount(left, "0");
    }
    if (right) {
      rightCount = getMatchCount(right, "1");
    }

    const sum = leftCount + rightCount;
    if (max < sum) {
      max = sum;
    }
  }

  return max;
};

function getMatchCount(str, part) {
  return (str.match(new RegExp(part, "g")) || []).length;
}
