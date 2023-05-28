class Solution {
    // Brute-Force:
    public void setZeroes(int[][] matrix) {
        // If I encountered any cell with zero then set the whole row and column to zero 
        // Increase left top by 1, so the changed values can be avoid to chance the whole 
        // Matrix.
        int row = matrix.length;
        int col = matrix[0].length;
        
        // Maintaining another extra space to maintain the location/index of Zeros in the given matrix:
        int [][]temp = new int[row][col];
        
        // Marking the Matrix:
        for(int i=0; i<row; i++){
            for(int j = 0; j<col; j++){
                // If I found any cell with zero then I have to 
                // Update the whole row and column
                // Increase the i++;
                if(matrix[i][j] == 0) temp[i][j] = 1;
            }
        }
        
        // Now, We are having the index 
        // Based on which we can update the row and column:
        // Iterate over the temp and updating the Matrix:
        for(int i=0; i<row; i++){
            for(int j = 0; j<col; j++){
                // If I found any cell with zero then I have to 
                // Update the whole row and column
                // Increase the i++;
                if(temp[i][j] == 1){
                    // Call updateMat();
                    updateMat(matrix, i, j);
                }
            }
        }
        
    }
    private void updateMat(int [][]mat, int tRow, int tCol){
        int row = mat.length;
        int col = mat[0].length;
        
        // Updating the Col:
        for(int i=0; i<col; i++){
            mat[tRow][i] = 0;
        }
        
        // Updating the Row:
        for(int i=0; i<row; i++){
            mat[i][tCol] = 0;
        }
    }
}