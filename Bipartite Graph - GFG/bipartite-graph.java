//{ Driver Code Starts
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
            int V = Integer.parseInt(S[0]);
            int E = Integer.parseInt(S[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for(int i = 0; i < V; i++){
                adj.add(new ArrayList<Integer>());
            }
            for(int i = 0; i < E; i++){
                String[] s = br.readLine().trim().split(" ");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isBipartite(V, adj);
            if(ans)
                System.out.println("1");
            else System.out.println("0");
       }
    }
}
// } Driver Code Ends


class Solution{
    class Pair{
        int src;
        int color;
        Pair(int src, int color){
            this.src = src;
            this.color = color; // == 1(Blue), == 2(Red), == 0 (Uncolored)
        }
    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>graph){
        // To Check Bipartite => Algo
        // BFS
        // Creating visited array:
        int []vis = new int[V];
        // Creating a Queue:
        Queue<Pair> q = new LinkedList<>();
        
        // To take care of each components of the Graph:
        for(int i=0; i<V; i++){
            if(vis[i] != 0)continue;
            
            // Adding src element:
            q.add(new Pair(i, 1));
            
            // Iterate 
            while(q.size() > 0){
                // Front
                Pair peek = q.poll();
                int src = peek.src;
                int currColor = peek.color;
                
                // Mark
                if(vis[src] != 0) continue;
                vis[src] = currColor;
                
                // Work
                int oppColor = currColor == 1?2:1;
                
                // Add nbr's
                for(int nbr: graph.get(src)){
                    if(vis[nbr] == 0){
                        q.add(new Pair(nbr, oppColor));
                    }
                    else if(vis[nbr] == currColor) return false;
                }
            }
        }
        
        return true;
    }
}