class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums){
            int digit_count = 0;
            while (i > 0){
                digit_count++;
                i /= 10;
            }
            if (digit_count % 2 == 0)
                count++;
        }
        return count;
    }
}