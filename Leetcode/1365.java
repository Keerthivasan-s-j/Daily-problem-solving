import java.util.*;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] temp = Arrays.copyOf(nums, n);
        Arrays.sort(temp);
        int[] res = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<n; i++) {
            int num = temp[i];
            if (!map.containsKey(num)) {
                map.put(num, i);
            }
        }
        int k = 0;
        for (int num : nums) {
            res[k++] = map.get(num);
        }
        return res;
    }
}