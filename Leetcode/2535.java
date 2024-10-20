class Solution {
    public int differenceOfSum(int[] nums) {
        int element_sum = 0;
        int digit_sum = 0;
        for (int i : nums){
            element_sum += i;
            while (i > 0){
                digit_sum += i % 10;
                i /= 10;
            }
        }
        return Math.abs(element_sum - digit_sum);
    }
}