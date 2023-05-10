class Solution {
    public int findJudge(int n, int[][] trust) {
        // Edge Case:
        if (trust.length == 0 && n == 1) 
            return 1;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        // Fill with empty AL:
        for(int i=0; i<=n; i++) graph.add(new ArrayList<>());
        
        // Forming the Graph:
        for(var t: trust){
            int v = t[0];
            int u = t[1];
            // Forming an directed graph:
            graph.get(v).add(u);
        }
        System.out.println(graph);
        
        // Now, finding the trusts judge:
        // Everyone Trusts the Judge, but judge does not trust any one.
        int pans = -1;
        boolean judgeFound = true;
        for(int i=1; i<graph.size(); i++){
            if(graph.get(i).size() == 0){
                pans = i;
                
                // Check Whether every one trust the potential judge or not:
                for(int j=1; j<graph.size(); j++){
                    if(i == j) continue;
                    else if(!graph.get(j).contains(pans)){
                        judgeFound = false;
                        break;
                    } 
                }
                
                // Checking for Actual Jugje:
                if(judgeFound) return pans;
            }
        }
        
        
        return -1;
    }
}