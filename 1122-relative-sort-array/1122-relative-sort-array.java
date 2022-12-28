class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length;      
        int m = arr2.length;

        HashMap<Integer,Integer> h = new HashMap<>();
        int []ans = new int[n];
        int c = 0;
        
        // Taking the Array 1 values to the HashMap:
        for (int i = 0; i < n; i++) {
            int ele = arr1[i];
            if(h.containsKey(ele)){
                h.put(ele, h.get(ele)+1);
            }
            else{
                h.put(ele, 1);
            }
        }

        // First Putting the Relative Sorting Elements
        for (int i = 0; i < m; i++) {
            int currentEle = arr2[i];
            while(h.get(currentEle) > 0){
                ans[c++] = currentEle;
                // Reducing the Frequency of the Element form the HashMap:
                h.put(currentEle, h.get(currentEle)-1);
            }
        }

        // Sorting the Array 1:
        Arrays.sort(arr1);
        // Now, Putting the leftout elements:
        for (int i = 0; i < n; i++) {
            int num = arr1[i];
            if(h.get(num) != 0){
                ans[c++] = num;
            }
        }
        
        // Returning 
        return ans;
    }
}