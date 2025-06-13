class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        boolean zero = false;
        int zero_count = 0;
        int product = 1;
        for (int num : nums) {
            if (num == 0) {
                zero = true;
                zero_count++;
                if (zero_count > 1)
                    return res;
                continue;
            }
            product *= num;
        }
        for (int i = 0; i<n; i++) {
            int num = nums[i];
            if (num != 0) {
                res[i] = (zero) ? 0 : product / num;
            }
            else {
                res[i] = product;
            }
        }
        return res;
    }
}