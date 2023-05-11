class Solution {
    class Pair{
        int src;
        int color;
        Pair(int src, int color){
            this.src = src;
            this.color = color;
        }
    }
    public boolean isBipartite(int[][] graph) {
        // To check Biparttite we are gonna use BFS Algor, Where we use Queue.
        // Creating a Queue:
        Queue<Pair> q = new LinkedList<>();
        // Creating a visited Array:
        int V = graph.length;
        int []vis = new int[V];
        
        // To take care of all the components of the graph:
        for(int v = 0; v<V; v++){
            // If already visited then skip:
            if(vis[v] != 0) continue;
            // Taking the src vertex into the queue:
            q.add(new Pair(v, 1));
            
            // Iterate
            while(q.size() > 0){
                // Front
                Pair front = q.poll();
                int src = front.src;
                int currColor = front.color;
                
                // Mark
                if(vis[src] != 0) continue;
                vis[src] = currColor;
                
                // Work
                int oppColor = currColor == 1?2: 1;
                
                // Add nbr's
                for(int nbr: graph[src]){
                    if(vis[nbr] == 0){
                        // Add nbr's 
                        q.add(new Pair(nbr, oppColor));
                    }
                    else if(vis[nbr] == currColor) return false;
                }
            }
        }
        return true;
    }
}