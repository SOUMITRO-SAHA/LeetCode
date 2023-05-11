class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // First, Creating a DAG:
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        // Creating an In-degree Array:
        int[] indeg = new int[numCourses];
        
        // Filling with empty ArrayList:
        for(int i=0; i<numCourses; i++) graph.add(new ArrayList<>());
        
        // Creating the DAG:
        for(int []e: prerequisites){
            int v = e[0];
            int u = e[1];
            
            graph.get(u).add(v);
            indeg[v]++;
        }
        
        // Now, I am having a Graph and an Indegree Array as well, So
        // Next task is to perform BFS to sort Topologically:
        Queue<Integer> q = new LinkedList<>(); // It will stores the elements which is having indegree Zero.
        
        // Adding all the peoples which is having indegree zero:
        for(int i=0; i< numCourses; i++) if(indeg[i] == 0) q.add(i);
        // Creating a topo ArrayList to store the Sorted result:
        ArrayList<Integer> topo = new ArrayList<>();
        
        // Iterating 
        while(q.size() > 0){
            // Front
            int front = q.poll();
            
            // Mark
            // Work
            topo.add(front);
            
            // Add nbr's
            for(int nbr: graph.get(front)){
                // I will decrese the indegree of nbr:
                indeg[nbr]--;
                if(indeg[nbr] == 0) q.add(nbr);
            }
        }
        
        // Now, Checking whether the topo is invalid or not:
        if(topo.size() < numCourses){
            // the given graph in not a DAG, it was having a cycle,
            // Hence topolocial sorting in not possible
            return new int[0];
        }
        
        // If I am here that means, topological sorting is possible, and the topo is valid:
        // An Array for storing the Results:
        int []res = new int[numCourses];
        for(int i=0; i<topo.size(); i++) res[i] = topo.get(i);
        
        return res;
    }
}