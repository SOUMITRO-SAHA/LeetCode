class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            int currentMaxOcc = 0;
            j = i;
            while (j < n && nums[i] == 1) {
                if (nums[i] == nums[j]) {
                    currentMaxOcc++;
                    j++;
                } else
                    break;
            }

            // Assigning the Max Occ:
            maxConsecutiveOnes = (maxConsecutiveOnes < currentMaxOcc) ? currentMaxOcc : maxConsecutiveOnes;
            i = j;
        }
        return maxConsecutiveOnes;
    }
}