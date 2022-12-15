class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        // Traversing through the row and col for searching the key
        for(int i=0; i<row; i++){
            // int []arr = matrix[i];
            // Using Binary Search to find the key
            int s = 0;
            int e = col-1;
            while(s <= e){
                int mid = (s + e)/2;
                if(matrix[i][mid] == target){                  
                    return true;
                } 
                else if(target < matrix[i][mid]) 
                    e = mid -1;
                else if(matrix[i][mid] < target) 
                    s = mid +1;
            }
            
        }
        return false;
    }
}