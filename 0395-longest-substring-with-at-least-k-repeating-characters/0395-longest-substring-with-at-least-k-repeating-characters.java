class Solution {
    // This method takes in three arguments - a string, an integer k and an integer x.
    private int longest_window_x_unique_character_atleast_k_repeating(String s, int k, int x){
        // First, I have to maintain some variables with takes care of countOfUnique, countOfKRep
        int countOfUnique = 0;
        int countOfKRep = 0;
        int sp = 0, ep = 0, ans = 0;
        // I have to consider a frequency array of each character:
        int []fq = new int[123];

        // Now, I have to Iterate over the string to find the x unique character repeating k times:
        while(ep < s.length()){
            // Acquire new People:
            char ch = s.charAt(ep);
            // Increasing the fq of the current new character:
            fq[ch]++;

            // Check sum:
            if(fq[ch] == 1) countOfUnique++; // First Occurrence
            if(fq[ch] == k) countOfKRep++; // Fq of the ch becomes k so increasing the k.

            // As soon as the unique characters becomes > x
            // Shrink until unique characters becomes <= x
            while(countOfUnique > x){
                char delCh = s.charAt(sp);
                fq[delCh]--;

                // Check Sum:
                if(fq[delCh] == 0) countOfUnique--;
                if(fq[delCh] == k-1) countOfKRep--;

                // Increasing the sp:
                sp++;
            }
            // Now, If I stand here that means I am having x unique characters with exactly k times of occurrence:
            if(countOfUnique == x && countOfKRep == x) ans = Math.max(ans, ep -sp +1);

            // Increasing the ep:
            ep++;
        }
        return ans;
    }
    // This method takes in two arguments - a string and an integer k.
    public int longestSubstring(String s, int k) {
        // For this; I have to check each 26 characters how many times each character repeating in the string:
        int ans = 0;
        for (int i = 0; i <= 26 ; i++) {
            // Call the above method with the string s, integer k and integer i and get the maximum of this value with the value of 'ans'
            int xUniqueRep = longest_window_x_unique_character_atleast_k_repeating(s, k, i);
            ans = Math.max(xUniqueRep, ans);
        }
        // Return the final value of 'ans'
        return ans;
    }
}
