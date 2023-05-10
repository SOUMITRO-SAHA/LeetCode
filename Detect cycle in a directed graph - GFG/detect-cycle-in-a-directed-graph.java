//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    // In case of Direct Graph we have to use DFS Algo Only.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> graph) {
        boolean []vis = new boolean[V];
        boolean []path = new boolean[V];
        
        // Handling all the components:
        for(int i=0; i<V; i++){
            if(vis[i]) continue;
            boolean found = dfs(graph, i, vis, path);
            if(found) return true;
        }
        return false;
    }
    
    private boolean dfs(ArrayList<ArrayList<Integer>> graph, int src, boolean []vis, boolean []path){
        // Mark
        vis[src] = true;
        path[src] = true;
        // Work
        
        // Visit all the unvisited neighbours:
        for(int nbr: graph.get(src)){
            // Checking whether the nbr is in the path or not:
            if(path[nbr]) return true;
            else if(!vis[nbr]){
                boolean found = dfs(graph, nbr, vis, path);
                if(found) return true;
            }
        }
        
        path[src] = false;
        return false;
    }
}