class Solution {
    public int minOperations(int[] nums, int k) {
        int minOperations = 0;
        for (int num : nums) {
            if (num < k)
                minOperations++;
        }
        return minOperations;
    }
}