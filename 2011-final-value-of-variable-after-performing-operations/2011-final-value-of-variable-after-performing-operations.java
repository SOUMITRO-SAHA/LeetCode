class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]){
                case "++X", "X++":
                    x += 1;
                    break;
                case "--X", "X--":
                    x -= 1;
                    break;
            }
        }
        return x;
    }
}