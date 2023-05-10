class Solution {
    public int findCenter(int[][] edges) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
        // Filling the graph with empty ArrayList<>():
        // It is starts from index 1:
        int totalEdges = edges.length;
        int sizeOfGraph = totalEdges+2;
        for(int i=0; i <= sizeOfGraph; i++) graph.add(new ArrayList<>());
        
        // Creating the Graph form the edges:
        for(int []e: edges){
            int v = e[0];
            int u = e[1];
            
            // Creating undirected graph:
            graph.get(v).add(u);
            graph.get(u).add(v);
        }
        
        // Now, the largest length ArrayList is the center:
        int largestVertex = 0;
        int len = 0;
        for(int i = 1; i < graph.size(); i++){
            int currLen = graph.get(i).size();
            if(currLen > len) largestVertex = i;
            len = Math.max(currLen, len);
        }
        
        return largestVertex;
    }
}