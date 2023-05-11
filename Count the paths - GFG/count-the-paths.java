//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            int s = Integer.parseInt(S[2]);
            int d = Integer.parseInt(S[3]);
            int[][] edges = new int[m][2];
            for(int i = 0; i < m; i++){
                String[] S1 = br.readLine().trim().split(" ");
                edges[i][0] = Integer.parseInt(S1[0]);
                edges[i][1] = Integer.parseInt(S1[1]);
            }
            Solution obj = new Solution();
            int ans = obj.possible_paths(edges, n, s, d);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public int possible_paths(int[][] edges, int n, int s, int d){
        // Creating a DAG Graph:
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
        // Filling the Graph with empty AL:
        for(int i=0; i<n; i++) graph.add(new ArrayList<>());
        
        // Creating the Graph:
        for(int []e: edges){
            int u = e[0];
            int v = e[1];
            
            // Creating a DAG:
            graph.get(u).add(v);
        }
        
        // Now, I have a DAG:
        // System.out.println(graph);
        // Calling DFS for count all the distinct paths:
        boolean []path = new boolean[n];
        int []cnt = new int[1];
        dfs(graph, s, d, path, cnt);
        
        return cnt[0];
    }
    
    private void dfs(ArrayList<ArrayList<Integer>> graph, int src, int dest, boolean []path, int []cnt){
        // Base Case:
        if(src == dest){
            cnt[0]++;
        }
        
        // Mark:
        path[src] = true;
        // Work:
        // Visit all unvisited Neighbours:
        for(int nbr: graph.get(src)){
            if(!path[nbr]) dfs(graph, nbr, dest, path, cnt);
        }
        // In the Return Time mark the path false:
        path[src] = false;
    }
}