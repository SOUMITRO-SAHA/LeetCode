/**
 * @param {number[]} nums
 * @return {number[]}
 */
// Merge Sort Algorithm:
let mergeTwoArr = (arr, l, mid, r) => {
    let ans =[]; // Empty Array:
    
    let i = l;
    let j = mid+1;
    
    while(i <= mid && j <= r){
        if(arr[i] <= arr[j]){
            ans.push(arr[i++]);
        }
        else{
            ans.push(arr[j++]);
        }
    }
    // If any Part remaining:
    while(i <= mid) ans.push(arr[i++]);
    while(j <= r) ans.push(arr[j++]);
    
    // Copying the ans array to the original array
    for(let n = l, m = 0; n <= r; n++, m++){
        arr[n] = ans[m];
    }
}

let mergeSort = (res, l, r) =>{
    // Base Case:
    if(l < r){
        let mid = l + Math.floor((r-l)/2);
        mergeSort(res,l,mid); // Left Part
        mergeSort(res, mid+1, r); // Right Part
        
        // Merging the Parts
        mergeTwoArr(res,l, mid, r);
    }
    
}

var sortArray = function(res) {
    // l = left
    // r = right
    // Calling Merge Sort Function:
    mergeSort(res, 0, res.length -1);
    return res;
};
