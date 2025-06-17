class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int[] leftsum = new int[n+1];
        for (int i=1; i<n+1; i++) {
            leftsum[i] = leftsum[i-1] + nums[i-1];
        }
        int total = leftsum[n];
        for (int i=0; i<n; i++) {
            int rightsum = total - leftsum[i] - nums[i];
            if (leftsum[i] == rightsum)
                return i;
        }
        return -1;
    }
}