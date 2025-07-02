class Solution {
    public int[] transformArray(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            if (nums[right] % 2 == 0) {
                nums[right] = nums[left];
                nums[left] = 0;
                left++;
            }
            else {
                nums[right] = 1;
                right--;
            }
        }
        return nums;
    }
}