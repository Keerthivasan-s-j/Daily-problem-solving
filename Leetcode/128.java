import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n == 0 || n == 1) return n;
        int max_len = 1;
        int len = 1;
        for (int i = 0; i<n-1; i++) {
            if (nums[i+1] == nums[i])
                continue;
            else if (nums[i+1] == nums[i]+1)
                len++;
            else 
                len = 1;
            max_len = Math.max(len, max_len);
        }
        return max_len;
    }
}