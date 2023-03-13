class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nger = nextGreaterElementRight(nums2);
        
        int[] res = new int[nums1.length];
        
        for(int i = 0; i<nums2.length; i++){
            int ele = nums2[i];
            for(int j=0; j<nums1.length; j++){
                if(nums1[j] == ele){
                    res[j] = nger[i];
                    break;
                }
            }
        }
        
        return res;
    }
    
    public int[] nextGreaterElementRight(int[] arr){
        int len = arr.length;
        Stack<Integer> st = new Stack<>();
        int []nger = new int[len];
        
        for(int i = 0; i<len; i++){
            int ele = arr[i];
            while(st.size() > 0 && ele > arr[st.peek()]){
                int idx = st.pop();
                nger[idx] = ele;
            }
            
            st.push(i);
        }
        while(st.size() > 0){
            nger[st.pop()] = -1;
        }
        
        return nger;
    }
}