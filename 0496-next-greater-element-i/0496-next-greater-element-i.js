/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var nextGreaterElement = function(nums1, nums2) {
    const map = {};
    const st = []; // Stack => LIFO,
    
    for(let i=0; i<nums2.length; i++){
        let ele = nums2[i];
        // Whenever, the ele > nums2[st.peek()]
        while(st.length > 0 && ele > nums2[st[st.length -1]]){
            map[nums2[st.pop()]] = ele;
        }
        // Pushing the index into the Stack:
        st.push(i);
    }
    // If Stack Still Has elements:
    while(st.length > 0){
        map[nums2[st.pop()]] = -1;
    }
    // console.log(map);
    const res = [];
    for(let i=0; i<nums1.length; i++){
        let ele = nums1[i];
        let nger = map[ele];
        res[i] = nger;
    }
    return res;
};
