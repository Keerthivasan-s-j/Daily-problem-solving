import java.util.*;
class Solution {
    public int reverseNum(int num) {
        int res = 0;
        while (num > 0) {
            res = res*10 + num % 10;
            num /= 10;
        }
        return res;
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
            set.add(reverseNum(num));
        }
        return set.size();
    }
}