class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> hash = new HashMap<>();
        // Taking the jewels into the HashMap:
        for (int i = 0; i < jewels.length(); i++) {
            char ch = jewels.charAt(i);
            if(hash.containsKey(ch)){
                hash.put(ch, hash.get(ch)+1);
            }
            else{
                hash.put(ch, 1);
            }
        }

        // Variable
        int count = 0;

        // Checking how many jewels are present in the stones:
        for (int i = 0; i < stones.length(); i++) {
            char stoneChar = stones.charAt(i);
            if (hash.containsKey(stoneChar)) {
                count++;
            }
        }

        return count;
    }
}