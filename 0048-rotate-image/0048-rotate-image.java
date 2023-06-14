class Solution {
    public void rotate(int[][] mat) {
        int n = mat.length;
        
        // Transportation of Matrix:
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                // Swapping the elements
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        
        
        // 90 deg rotate:
        // R -> L
        for(int i=0; i<n; i++){
            int []arr = mat[i];
            int si = 0;
            int ei = arr.length -1;
            while(si < ei){
                int temp = arr[si];
                arr[si] = arr[ei];
                arr[ei] = temp;
                
                si++;
                ei--;
            }
        }
    }
}