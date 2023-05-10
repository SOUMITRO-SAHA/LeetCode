class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        // First, We have to form a graph:
        // Then I have to start traversing the graph using DFS Algorithm. If I am able to reach destination then 
        // Path is present otherwise not present:
        ArrayList<Integer> []graph = new ArrayList[n];
        
        // Filling the graph with empty arraylist:
        for(int i=0; i<n ;i++) graph[i] = new ArrayList<>();
        
        // Creating the Graph:
        for(var e: edges){
            int v = e[0];
            int u = e[1];
            
            // Creating Undirected Graph:
            graph[u].add(v);
            graph[v].add(u);
        }
        
        // Start Traversing on the Graph using DFS:
        // Maintaining the Visited Array:
        boolean []vis = new boolean[graph.length];
        dfs(graph, source, vis);
        // Finding whether the graph can have a valid path or not:
        // System.out.println(Arrays.toString(vis));
        return vis[destination];
    }
    private void dfs(ArrayList<Integer> []graph, int src, boolean []vis){
        // Mark
        vis[src] = true;
        // Work:
        
        // visit all the unvisited neighbours:
        for(int nbr: graph[src]){
            if(!vis[nbr]) dfs(graph, nbr, vis);
        }
    }
}