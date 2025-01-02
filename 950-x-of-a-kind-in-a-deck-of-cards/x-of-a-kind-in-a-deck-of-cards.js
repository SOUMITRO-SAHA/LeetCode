/**
 * @param {number[]} deck
 * @return {boolean}
 */
var hasGroupsSizeX = function (deck) {
  const map = new Map();
  let min = Infinity;

  for (let i = 0; i < deck.length; i++) {
    const ele = deck[i];

    // Setting the occurrence
    if (map.has(ele)) {
      map.set(ele, map.get(ele) + 1);
    } else {
      map.set(ele, 1);
    }
  }

  for (const [key, val] of map) {
    if (val < min) min = val;
  }

  // Now Iterate over the HashMap to find the gcd
  let gcdValue = min;

  for (const [key, val] of map) {
    gcdValue = gcd(gcdValue, val);
  }

  if (gcdValue > 1 && gcdValue > 1) {
    return true;
  }

  return false;
};

function gcd(a, b) {
  if (a === 0) return b;

  return gcd(b % a, a);
}
