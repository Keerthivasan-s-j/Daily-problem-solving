class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i : nums){
            int digit_sum = 0;
            while (i>0){
                digit_sum += i % 10;
                i /= 10;
            }
            if (digit_sum < min)
                min = digit_sum;
        }
        return min;
    }
}