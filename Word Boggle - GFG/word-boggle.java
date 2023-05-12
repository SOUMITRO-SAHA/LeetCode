//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            String[] dictionary = new String[N];
            for(int i=0;i<N;i++)
            {
                dictionary[i] = sc.next();
            }
            
            int R = Integer.parseInt(sc.next());
            int C = Integer.parseInt(sc.next());
            
            char board[][] = new char[R][C];
            for(int i=0;i<R;i++)
            {
                for(int j=0;j<C;j++)
                {
                    board[i][j] = sc.next().charAt(0);
                }
            }
            
            Solution obj = new Solution();
            String[] ans = obj.wordBoggle(board, dictionary);
            
            if(ans.length == 0) System.out.println("-1");
            else
            {
                Arrays.sort(ans);
                for(int i=0;i<ans.length;i++)
                {
                    System.out.print(ans[i] + " ");
                }
                System.out.println();
            }
            
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// class Solution{
//     static boolean dfsTraversal(char board[][], String word, boolean visited[][], int row, int col, int idx, int m, int n){
//         if(idx == word.length())
//         return true;
        
//         if(row >=0 && row < m && col >=0 && col < n && !visited[row][col] && board[row][col] == word.charAt(idx))
//         {
//             visited[row][col] = true;
            
//             if(dfsTraversal(board, word, visited, row+1,col,idx+1, m,n) || dfsTraversal(board, word, visited, row-1,col,idx+1, m,n) 
//             || dfsTraversal(board, word, visited, row+1,col+1,idx+1, m,n) || dfsTraversal(board, word, visited, row-1,col-1,idx+1, m,n)
//             || dfsTraversal(board, word, visited, row,col+1,idx+1, m,n) || dfsTraversal(board, word, visited, row,col-1,idx+1, m,n)
//             || dfsTraversal(board, word, visited, row+1,col-1,idx+1, m,n) || dfsTraversal(board, word, visited, row-1,col+1,idx+1, m,n))
            
//             return true;
            
//             visited[row][col] = false;
            
//         }
        
//         return false;
        
//     }
//     static boolean wordExistsInDictionary(String word, char board[][], int m, int n)
//     {
//         int idx = 0;
        
//         boolean visited[][] = new boolean[m][n];
        
//         for(int i = 0; i < m; i++)
//         {
//             for(int j = 0; j < n; j++)
//             {
//                 if(board[i][j] == word.charAt(idx))
//                 {
//                     if(dfsTraversal(board, word, visited, i,j,idx,m,n))
//                     return true;
//                 }
//             }
//         }
        
//         return false;
//     }
//     public String[] wordBoggle(char board[][], String[] dictionary)
//     {
//         // Write your code here
       
//       int m = board.length;
//       int n = board[0].length;
       
//       ArrayList<String> res = new ArrayList<>();
       
//       for(int i = 0; i < dictionary.length; i++)
//       {
//           String word = dictionary[i];
           
//           if(wordExistsInDictionary(word,board, m, n))
//           res.add(word);
//       }
    
//     String ans[] = new String[res.size()];
    
//     for(int i = 0; i < res.size();i++)
//     {
//         ans[i] = res.get(i);
//     }
    
//     return ans;
        
//     }
// }

class Solution {
    // Helper method for performing DFS traversal
    static boolean dfsTraversal(char board[][], String word, boolean visited[][], int row, int col, int idx, int m, int n) {
        if (idx == word.length())
            return true;

        if (row >= 0 && row < m && col >= 0 && col < n && !visited[row][col] && board[row][col] == word.charAt(idx)) {
            visited[row][col] = true;

            // Explore all possible adjacent cells
            if (dfsTraversal(board, word, visited, row + 1, col, idx + 1, m, n)
                    || dfsTraversal(board, word, visited, row - 1, col, idx + 1, m, n)
                    || dfsTraversal(board, word, visited, row + 1, col + 1, idx + 1, m, n)
                    || dfsTraversal(board, word, visited, row - 1, col - 1, idx + 1, m, n)
                    || dfsTraversal(board, word, visited, row, col + 1, idx + 1, m, n)
                    || dfsTraversal(board, word, visited, row, col - 1, idx + 1, m, n)
                    || dfsTraversal(board, word, visited, row + 1, col - 1, idx + 1, m, n)
                    || dfsTraversal(board, word, visited, row - 1, col + 1, idx + 1, m, n)) {
                return true;
            }

            visited[row][col] = false;
        }

        return false;
    }

    // Helper method to check if a word exists in the board
    static boolean wordExistsInDictionary(String word, char board[][], int m, int n) {
        int idx = 0;
        boolean visited[][] = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(idx)) {
                    if (dfsTraversal(board, word, visited, i, j, idx, m, n)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public String[] wordBoggle(char board[][], String[] dictionary) {
        int m = board.length;
        int n = board[0].length;

        ArrayList<String> res = new ArrayList<>();

        // Check each word in the dictionary
        for (int i = 0; i < dictionary.length; i++) {
            String word = dictionary[i];

            // If the word exists in the board, add it to the result
            if (wordExistsInDictionary(word, board, m, n)) {
                res.add(word);
            }
        }

        // Convert the result to an array
        String ans[] = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }

        return ans;
    }
}
