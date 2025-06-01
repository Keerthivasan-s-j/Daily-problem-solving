class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int max = -1;
        int ind = -1;
        for (int i = 0; i<n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                ind = i;
            }
        }
        for (int i = 0; i<n; i++) {
            int num = nums[i];
            if (i != ind && max < num * 2) 
                return -1;
        }
        return ind;
    }
}