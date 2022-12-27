class Solution {
    public String getHint(String secret, String guess) {
        int n = secret.length();
        int bulls = 0;
        int cows = 0;
        
        // Init a Frequency Array 
        int []se = new int[10];
        int []gu = new int[10];
        
        // Taking the secret & guess numbers except the match with currect index:
        for(int i=0; i<n; i++){
			int currentNum = secret.charAt(i) - '0';
			int guessNum = guess.charAt(i) - '0';
			if(secret.charAt(i) == guess.charAt(i))
    			bulls++;
			else{
    			se[currentNum]++;
			    gu[guessNum]++;
			}
        }
        
        // Matching the guess:
        // Checking for Cows:
        for(int i=0; i<10; i++){
            cows += Math.min(se[i], gu[i]);
        }
        
        // Assigning the Values:
        StringBuilder sb = new StringBuilder();
        sb.append(bulls);
        sb.append('A');
        sb.append(cows);
        sb.append('B');
        
        //Printing    
        return sb.toString();
    }
}