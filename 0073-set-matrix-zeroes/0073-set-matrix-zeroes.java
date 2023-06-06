class Solution {
    // Brute-Force Approach:
    public void setZeroes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        // This array to point/marking the row and colum 
        // that needed to up update.
        int []r = new int[n];
        int []c = new int[m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat[i][j] == 0){
                    r[i] = c[j] = 1;
                }
            }
        }
        
        // Traversing over the []r:
        for(int i=0; i<n; i++){
            if(r[i] == 1) rowToZero(mat, i);
        }
        // Traversing over the []c
        for(int i=0; i<m; i++){
            if(c[i] == 1) colToZero(mat, i);
        }
    }
    private void rowToZero(int [][]mat, int row){
        for(int i=0; i<mat[0].length; i++){
            mat[row][i] = 0;
        }
    }
    private void colToZero(int [][]mat, int col){
        for(int i=0; i < mat.length; i++){
            mat[i][col] = 0;
        }
    }
}