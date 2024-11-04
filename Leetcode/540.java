class Solution {
    public int singleNonDuplicate(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        if (len == 1 || len == 2)
            return nums[0];
        while (left < right){
            if (nums[left] == nums[left + 1])
                left += 2;
            else
                return nums[left];
            if (nums[right] == nums[right - 1])
                right -= 2;
            else
                return nums[right];
        }
        return nums[len / 2];
    }
}