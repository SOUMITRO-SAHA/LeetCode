//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main(String args[]) throws IOException {

        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            int S = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            
            int[] ptr = ob.dijkstra(V, adj, S);
            
            for(i=0; i<V; i++)
                System.out.print(ptr[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    /*
        {
            0: { {edge, Weight}, {edge, weight} }
            1: { {edge, Weight} }
        }
    */
    static class Pair{
        int src;
        String psf;
        int wsf;
        Pair(int src, String psf, int wsf){
            this.src = src;
            this.psf = psf;
            this.wsf = wsf;
        }
    } 
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> graph, int S){
        // Dijkstra Algorithm:
        // Key Points: 
        // Same as BFS:
        // We have to use Priority Queue.
        // Creating a visited array:
        boolean []vis = new boolean[V];
        // Creating a empty array of size V to store the results:
        int[] smallestPath = new int[V];
        // Filling the smallest path array with -1. As given in the question.
        Arrays.fill(smallestPath, -1);
        
        // Creating a PQ:
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.wsf - b.wsf);
        // Adding thr src to the pq:
        pq.add(new Pair(S, S+"", 0));
        
        while(pq.size() > 0){
            // Peek
            Pair peek = pq.poll();
            int src = peek.src;     // Extracting 
            int wsf = peek.wsf;       // Extracting
            String psf = peek.psf;    // Extracting
            // Mark
            if(vis[src]) continue;
            vis[src] = true;
            // work
            smallestPath[src] = wsf;
            // add nbr's
            for(var g: graph.get(src)){ // We are gonna get al of al: (2D AL) and, g is only one AL
                int nbr = g.get(0);
                int wt = g.get(1);
                
                // Adding all unvisited Neighbours:
                if(!vis[nbr]) pq.add(new Pair(nbr, psf+nbr, wsf+wt));
            }
        }
        
        // Returning the Result:
        return smallestPath;
    }
}

