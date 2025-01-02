/**
 * @param {number[]} deck
 * @return {boolean}
 */
var hasGroupsSizeX = function (deck) {
  const map = new Map();

  for (let i = 0; i < deck.length; i++) {
    const ele = deck[i];

    // Setting the occurrence
    if (map.has(ele)) {
      map.set(ele, map.get(ele) + 1);
    } else {
      map.set(ele, 1);
    }
  }

  let gcdValue = 0;
  for (const [key, val] of map) {
    gcdValue = gcd(gcdValue, val);
  }

  return gcdValue > 1;
};

function gcd(a, b) {
  if (a === 0) return b;

  return gcd(b % a, a);
}
