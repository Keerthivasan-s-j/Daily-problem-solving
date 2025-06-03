class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        if (n==1) return true;
        boolean inc = nums[0] <= nums[n-1];
        if (inc) {
            for (int i=0; i<n-1; i++) {
                if (nums[i] > nums[i+1])
                    return false;
            }
        }
        else {
            for (int i=0; i<n-1; i++) {
                if (nums[i] < nums[i+1])
                    return false;
            }
        }
        return true;
    }
}