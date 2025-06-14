import java.util.Arrays;

class Solution {
    public int findMaxK(int[] nums) {
        int n = nums.length;
        int left = 0; 
        int right = n-1;
        Arrays.sort(nums);
        while (left < right) {
            if (-nums[left] == nums[right])
                return nums[right];
            else if (-nums[left] < nums[right])
                right--;
            else
                left++;
        }
        return -1;
    }
}