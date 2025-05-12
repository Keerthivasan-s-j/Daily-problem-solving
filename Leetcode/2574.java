class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n+1];
        int[] res = new int[n];
        int total = 0;
        for (int i = 0; i<n; i++){
            prefix[i+1] = prefix[i] + nums[i];
            total += nums[i];
        }
        for (int i = 0; i<n; i++) {
            res[i] = Math.abs(prefix[i] - Math.abs(prefix[i+1] - total));
        }
        return res;
    }
}