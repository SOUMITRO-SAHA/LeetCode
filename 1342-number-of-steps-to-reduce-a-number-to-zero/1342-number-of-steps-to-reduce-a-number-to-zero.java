class Solution {
    int count = 0; 
    public int numberOfSteps(int num) {
        // Base Case:
        if(num == 0){
            return count;
        }
        
        // Counting the Steps each time:
        count++;
        
        if(num % 2 == 0){
            // Even Case:
            return numberOfSteps(num/2);
        }
        return numberOfSteps(num -1);
    }
}