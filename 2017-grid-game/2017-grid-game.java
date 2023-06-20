class Solution {
    // Optimum Approach:
    // TC: O(n), SC: O(n)
    public long gridGame(int[][] grid) {
        // Let, robot A tries to minimize the number of points collected by robot B.
        int row = grid.length;
        int col = grid[0].length;
        
        // Calling the suffix and preffix:
        long[] suf = findSuffix(grid);
        long[] pre = findPrefix(grid);
        
        // System.out.println(Arrays.toString(grid[0]));
        // System.out.println(Arrays.toString(grid[1]));
        // System.out.println("Suf + Pre");
        // System.out.println(Arrays.toString(suf));
        // System.out.println(Arrays.toString(pre));
        
        // Variable:
        long res = Long.MAX_VALUE;
        
        // Let robot A switch the row in i'th column:
        // So, robot B can collect either left-out elements of row0 or row1:
        for(int i=0; i<col; i++){
            // At i'th the robot A shift it's row
            long row0 = (i == col-1)?0: suf[i+1];
            long row1 = (i == 0)    ?0: pre[i-1];
            
            // So, robot B will collect the max of row0 or row1
            long score = Math.max(row0, row1);
            
            // And, as robot A will always trying to reduce the probability of robot B:
            // then, at the end of the day robot B will collect the minimum among all the possible
            // score's
            res = Math.min(res, score);
        }
        
        return res;
    }
    
    private long[] findSuffix(int [][]g){
        int len = g[0].length;
        
        // Extracting the Current Array
        long []suf = new long[len];
        
        // It will start Iteration from the end:
        suf[len -1] = (long)g[0][len -1];
        
        for(int i=len-2; i>=0; i--){
            suf[i] =g[0][i] + suf[i+1];
        }
        
        return suf;
    }
    
    private long[] findPrefix(int [][]g){
        int len = g[1].length;
        
        // Extracting the current array:
        long []pre = new long[len];
        
        // Assigning the zero'th element at the zero'th position:
        pre[0] = (long)g[1][0];
        // It will start Iteration from the start:
        for(int i=1; i<len; i++){
            pre[i] = g[1][i] + pre[i-1];
        }
        
        return pre;
    }
}