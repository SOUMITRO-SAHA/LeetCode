class Solution {
    // Brute-Force:
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int []mer = new int[n+m];
        
        int i=0;
        int p1=0;
        int p2=0;
        
        while(i<(m+n) && p1 < m && p2 < n){
            if(nums1[p1] <= nums2[p2]){
                mer[i++] = nums1[p1++];
            }
            else {
                mer[i++] = nums2[p2++];
            }
        }
        while(p1 < m) mer[i++] = nums1[p1++];
        while(p2 < n) mer[i++] = nums2[p2++];
        
        // Now, Updating the nums1:
        for(int j=0; j<(n+m); j++){
            nums1[j] = mer[j];
        }
    }
}