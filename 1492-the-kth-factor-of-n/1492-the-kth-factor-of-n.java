class Solution {
    // Brute-Force:
    // TC: O(n), SC: O(m)
    public int kthFactor(int n, int k) {
        List<Integer> res = new ArrayList<>();
        
        // Taking all the factores into the ArrayList:
        for(int i=1; i<=n; i++){
            if(n%i == 0) res.add(i);
        }
            
        // Outputing the K'th Factor form the ArrayList:
        if(res.size() >= k) return res.get(k-1);
        return -1;
    }
}