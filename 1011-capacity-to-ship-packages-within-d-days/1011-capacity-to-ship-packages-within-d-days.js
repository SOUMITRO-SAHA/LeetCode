/**
 * @param {number[]} weights
 * @param {number} days
 * @return {number}
 */
var shipWithinDays = function(weights, days) {
    let isPossible = (mid, d) =>{
        let day = 1, wt = 0;
        weights.forEach(el =>{
            let currWt = wt + el;
            if(currWt <= mid) wt = currWt;
            else{
                wt = el;
                day++;
            }
        })
        
        return day <= d;
    }
    // Edge Cases:
    if(days > weights.length) return -1;
    
    let max = Number.MIN_SAFE_INTEGER, sum = 0;
    weights.forEach(el => {
        max = Math.max(max, el);
        sum += el;
    });
    
    let low = max, high = sum;
    let pans = 0;
    while(low<=high){
        let mid = Math.floor(low + (high - low)/2); // Weight
        if(isPossible(mid, days)){
            // Find the least possible weight:
            pans = mid;
            high = mid -1;
        }
        else{
            // Find the least possible weight:
            low = mid +1;
        }
    }
    return pans;
};